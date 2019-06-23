package cn.edu.stbu.jw.subjectmatch.Service.impl;

import cn.edu.stbu.jw.subjectmatch.Entity.CompetitionInfo;
import cn.edu.stbu.jw.subjectmatch.Mapper.CompetitionInfoMapper;
import cn.edu.stbu.jw.subjectmatch.Service.ICompetitionInfoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CompetitionInfoSerivceImpl implements ICompetitionInfoSerivce {
    @Autowired
    CompetitionInfoMapper dao;
    @Override
    public void insertCI(CompetitionInfo ci) {
        dao.insertCI(ci);
    }

    @Override
    public void deleteCI(Long id) {
        dao.deleteCI(id);
    }

    @Override
    public void updateCI(CompetitionInfo ci) {
        dao.updateCI(ci);
    }

    @Override
    @Transactional(readOnly=true)
    public CompetitionInfo getCIById(Long id) {
        return dao.getCIById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public List<CompetitionInfo> listAll() {
        return dao.listAll();
    }

    @Override
    @Transactional(readOnly=true)
    public List<CompetitionInfo> limitQuery(int pageNow, int pageSize) {
        int index=(pageNow-1)*pageSize;

        return dao.limitQuery(index,pageSize);
    }

    @Override
    @Transactional(readOnly=true)
    public Integer getAll() {
        return dao.getAll();
    }

    @Override
    @Transactional(readOnly=true)
    public CompetitionInfo getCompetitionInfoByTitle(String title) {
        return dao.getCompetitionInfoByTitle(title);
    }
}
