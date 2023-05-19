package top.yn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.yn.dao")
public class QuestionSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionSearchApplication.class, args);
    }

}
