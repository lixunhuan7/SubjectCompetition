package cn.edu.stbu.jw.subjectmatch.Controller;

import cn.edu.stbu.jw.subjectmatch.Entity.CompetitionInfo;
import cn.edu.stbu.jw.subjectmatch.Entity.MatchAchievement;
import cn.edu.stbu.jw.subjectmatch.Entity.MatchNews;
import cn.edu.stbu.jw.subjectmatch.Entity.MatchTraining;
import cn.edu.stbu.jw.subjectmatch.Service.ICompetitionInfoSerivce;
import cn.edu.stbu.jw.subjectmatch.Service.IMatchAchievementService;
import cn.edu.stbu.jw.subjectmatch.Service.IMatchNewsService;
import cn.edu.stbu.jw.subjectmatch.Service.IMatchTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class index {
    @Autowired
    ICompetitionInfoSerivce CIService;
    @Autowired
    IMatchAchievementService MAService;
    @Autowired
    IMatchNewsService MNService;
    @Autowired
    IMatchTrainingService MTService;

    @RequestMapping("/")
    public String index(Model model){
        List<CompetitionInfo> CIList=CIService.limitQuery(1,4);
        List<MatchNews> MNList=MNService.limitQuery(1,3);
        List<MatchAchievement> MAList=MAService.limitQuery(1,5);
        List<MatchTraining> MTList=MTService.limitQuery(1,8);
        model.addAttribute("CIList",CIList);
        model.addAttribute("MNList",MNList);
        model.addAttribute("MAList",MAList);
        model.addAttribute("MTList",MTList);
        return "index";
    }

}
