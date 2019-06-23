package cn.edu.stbu.jw.subjectmatch.Controller;

import cn.edu.stbu.jw.subjectmatch.Entity.MatchAchievement;

import cn.edu.stbu.jw.subjectmatch.Service.IMatchAchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/MatchAchievement")
public class MatchAchievementController {
    @Autowired
    IMatchAchievementService daoCi;
    @RequestMapping("/listAll")
    @ResponseBody
    public List<MatchAchievement> listAll(){
        return daoCi.listAll();
    }

    @RequestMapping("/limitQuery")
    @ResponseBody
    public List<MatchAchievement> limitQuery(String pageNow,String pageSize){
        return daoCi.limitQuery(Integer.parseInt(pageNow),Integer.parseInt(pageSize));
    }
}
