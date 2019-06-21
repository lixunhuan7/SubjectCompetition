package cn.edu.stbu.jw.subjectmatch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "cn.edu.stbu.jw.subjectmatch.Mapper")
@SpringBootApplication
public class SubjectmatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectmatchApplication.class, args);
    }

}
