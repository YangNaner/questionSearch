package top.yn.dao;

import org.apache.ibatis.annotations.Param;
import top.yn.entity.Question;

import java.util.List;

public interface QuestionMapper {
    List<Question> selectByQuestionInfo(@Param("question") String question);
}
