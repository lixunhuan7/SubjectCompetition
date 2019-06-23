package cn.edu.stbu.jw.subjectmatch.Controller;

import cn.edu.stbu.jw.subjectmatch.Entity.MatchTraining;
import cn.edu.stbu.jw.subjectmatch.Service.IMatchTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/MatchTraining")
public class MatchTrainingController {
    @Autowired
    IMatchTrainingService daoCi;
    @RequestMapping("/listAll")
    @ResponseBody
    public List<MatchTraining> listAll(){
        return daoCi.listAll();
    }

    @RequestMapping("/limitQuery")
    @ResponseBody
    public List<MatchTraining> limitQuery(String pageNow,String pageSize){
        return daoCi.limitQuery(Integer.parseInt(pageNow),Integer.parseInt(pageSize));
    }
}
