package cn.edu.stbu.jw.subjectmatch.Controller;

import cn.edu.stbu.jw.subjectmatch.Entity.CompetitionInfo;
import cn.edu.stbu.jw.subjectmatch.Service.ICompetitionInfoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/CompetitionInfo")
public class CompetitionInfoController {
    @Autowired
    ICompetitionInfoSerivce daoCi;
    @RequestMapping("/listAll")
    @ResponseBody
    public List<CompetitionInfo> listAll(){
        return daoCi.listAll();
    }

    @RequestMapping("/limitQuery")
    @ResponseBody
    public List<CompetitionInfo> limitQuery(String pageNow,String pageSize){
        return daoCi.limitQuery(Integer.parseInt(pageNow),Integer.parseInt(pageSize));
    }


}
