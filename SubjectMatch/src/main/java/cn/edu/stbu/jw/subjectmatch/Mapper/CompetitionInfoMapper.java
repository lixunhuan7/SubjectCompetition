package cn.edu.stbu.jw.subjectmatch.Mapper;

import cn.edu.stbu.jw.subjectmatch.Entity.CompetitionInfo;

import java.util.List;

public interface CompetitionInfoMapper {
    //insert
    void insertCI(CompetitionInfo ci);
    //delete
    void deleteCI(Long id);
    //update
    void updateCI(CompetitionInfo ci);
    //select
    CompetitionInfo getCIById(Long id);

    List<CompetitionInfo> listAll();


}
