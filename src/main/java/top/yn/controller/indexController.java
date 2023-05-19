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
//        调用Service接口，执行SQL语句，并返回列表
        List<Question> questions = questionService.selectByQuestionInfo(question);
//        System.out.println("questions = " + questions);
//        判断是否查询成功，如果questions列表为 0 则查询失败。
        if (questions.size() == 0){
            return ResultGenerator.genFailResult("查询失败");
        }
//        并使用响应结果工具类封装，按格式返回Json字符串供前端处理。
        return ResultGenerator.genSuccessResult(questions);
    }

}
