package top.yn.service;

import org.springframework.stereotype.Service;
import top.yn.entity.Question;

import java.util.List;

@Service
public interface QuestionService {
    List<Question> selectByQuestionInfo(String question);
}
