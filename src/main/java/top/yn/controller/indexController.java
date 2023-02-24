package top.yn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import top.yn.entity.Question;
import top.yn.service.QuestionService;
import top.yn.util.Result;
import top.yn.util.ResultGenerator;

import java.util.List;

@Controller
public class indexController {
//    自动注入
    @Autowired
    private QuestionService questionService;

//    跳转到index页面
    @GetMapping("/")
    public String index() {
        return "index";
    }

//    通过用户输入查询
    @GetMapping("/select/{question}")
    @ResponseBody
    public Result select(@PathVariable("question") String question){
        List<Question> questions = questionService.selectByQuestionInfo(question);
//        System.out.println("questions = " + questions);
        if (questions.size() == 0){
            return ResultGenerator.genFailResult("查询失败");
        }
        return ResultGenerator.genSuccessResult(questions);
    }

}
