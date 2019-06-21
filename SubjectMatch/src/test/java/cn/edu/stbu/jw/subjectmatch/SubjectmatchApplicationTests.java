package cn.edu.stbu.jw.subjectmatch;

import cn.edu.stbu.jw.subjectmatch.Entity.CompetitionInfo;
import cn.edu.stbu.jw.subjectmatch.Mapper.CompetitionInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectmatchApplicationTests {

    @Autowired
    CompetitionInfoMapper maper;
    @Test
    public void contextLoads() {
        System.out.println(maper.getCIById(1l));
    }
    @Test
    public void test1(){
        System.out.println(maper.getCIById(1l));
        CompetitionInfo obj=maper.getCIById(1l);
        obj.setTitle("经典算法竞赛");
        maper.updateCI(obj);
        System.out.println(maper.getCIById(1l));
    }

}
