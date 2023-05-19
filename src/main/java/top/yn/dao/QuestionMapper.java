package top.yn.dao;

import org.apache.ibatis.annotations.Param;
import top.yn.entity.Question;

import java.util.List;

public interface QuestionMapper {
//    查询题目列表，并返回列表 @Param 参数声明 应与 xml文件中的SQL语句的{}中的参数名相同。
    List<Question> selectByQuestionInfo(@Param("question") String question);
}
