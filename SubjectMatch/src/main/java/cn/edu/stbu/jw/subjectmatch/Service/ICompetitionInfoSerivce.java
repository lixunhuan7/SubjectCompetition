package cn.edu.stbu.jw.subjectmatch.Service;

import cn.edu.stbu.jw.subjectmatch.Entity.CompetitionInfo;

import java.util.List;

public interface ICompetitionInfoSerivce {
    //insert
    void insertCI(CompetitionInfo ci);
    //delete
    void deleteCI(Long id);
    //update
    void updateCI(CompetitionInfo ci);
    //select
    CompetitionInfo getCIById(Long id);

    List<CompetitionInfo> listAll();

    List<CompetitionInfo> limitQuery(int pageNow, int pageSize);

    Integer getAll();

    CompetitionInfo getCompetitionInfoByTitle(String title);
}
