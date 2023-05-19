package top.yn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yn.dao.QuestionMapper;
import top.yn.entity.Question;
import top.yn.service.QuestionService;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> selectByQuestionInfo(String question) {
        return questionMapper.selectByQuestionInfo(question);
    }
}
