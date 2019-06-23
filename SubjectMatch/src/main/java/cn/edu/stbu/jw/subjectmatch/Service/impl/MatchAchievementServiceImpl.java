package cn.edu.stbu.jw.subjectmatch.Service.impl;

import cn.edu.stbu.jw.subjectmatch.Entity.MatchAchievement;
import cn.edu.stbu.jw.subjectmatch.Mapper.MatchAchievementMapper;
import cn.edu.stbu.jw.subjectmatch.Myinterface.ICRUDMapper;
import cn.edu.stbu.jw.subjectmatch.Service.IMatchAchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MatchAchievementServiceImpl implements IMatchAchievementService {
    @Autowired
    MatchAchievementMapper dao;

    @Override
    public void save(Object obj) {
        dao.save(obj);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public void update(Object obj) {
        dao.update(obj);
    }

    @Override
    public MatchAchievement getObjectByTitle(String title) {
        return (MatchAchievement) dao.getObjectByTitle(title);
    }

    @Override
    @Transactional(readOnly=true)
    public <T> T getObjectById(Long id) {
        return dao.getObjectById(id);
    }

    @Override
    @Transactional(readOnly=true)
    @Cacheable(cacheNames = {"MatchAchievement-listAll"})
    public <T> List<T> listAll() {
        return dao.listAll();
    }

    @Override
    @Transactional(readOnly=true)
    @Cacheable(cacheNames = {"MatchAchievement-limitQuery"},key = "#pageNow+'-'+#pageSize")
    public <T> List<T> limitQuery(int pageNow, int pageSize) {
        int index=(pageNow-1)*pageSize;
        return dao.limitQuery(index,pageSize);
    }

    @Override
    @Transactional(readOnly=true)
    @Cacheable(cacheNames = {"MatchAchievement-getAll"})
    public Integer getAll() {
        return dao.getAll();
    }
}
