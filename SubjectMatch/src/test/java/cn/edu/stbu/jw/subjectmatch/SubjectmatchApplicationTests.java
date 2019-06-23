package cn.edu.stbu.jw.subjectmatch;

import cn.edu.stbu.jw.subjectmatch.Entity.CompetitionInfo;
import cn.edu.stbu.jw.subjectmatch.Entity.MatchAchievement;
import cn.edu.stbu.jw.subjectmatch.Mapper.CompetitionInfoMapper;
import cn.edu.stbu.jw.subjectmatch.Mapper.MatchAchievementMapper;
import cn.edu.stbu.jw.subjectmatch.Service.IMatchAchievementService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectmatchApplicationTests {

    @Autowired
    CompetitionInfoMapper maper;
    @Autowired
    MatchAchievementMapper mapper1;
    @Autowired
    IMatchAchievementService service2;
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
    @Test
    public void test2(){
        System.out.println((MatchAchievement)mapper1.getObjectById(1l));
        MatchAchievement obj1=mapper1.getObjectById(1l);
        //System.out.println(mapper1.listAll());
       System.out.println( mapper1.getObjectByTitle("全国ACM一等奖"));
//        MatchAchievement obj= (MatchAchievement) mapper1.getObjectByTitle("12");
//        obj.setAchName("全国ACM一等奖");
//        mapper1.update(obj);
        List<MatchAchievement> list=mapper1.listAll();
        System.out.println(list);
//        System.out.println(mapper1.limitQuery(0,2));
    }
    @Test
    public void test3(){
        System.out.println(service2.getObjectByTitle("全国ACM一等奖"));
        System.out.println(service2.limitQuery(2,2));
    }
}
