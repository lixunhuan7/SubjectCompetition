package cn.edu.stbu.jw.subjectmatch.Controller;

import cn.edu.stbu.jw.subjectmatch.Entity.MatchNews;
import cn.edu.stbu.jw.subjectmatch.Service.IMatchNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/MatchNews")
public class MatchNewsController {
    @Autowired
    IMatchNewsService daoCi;
    @RequestMapping("/listAll")
    @ResponseBody
    public List<MatchNews> listAll(){
        return daoCi.listAll();
    }

    @RequestMapping("/limitQuery")
    @ResponseBody
    public List<MatchNews> limitQuery(String pageNow,String pageSize){
        return daoCi.limitQuery(Integer.parseInt(pageNow),Integer.parseInt(pageSize));
    }
}
