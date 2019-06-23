package cn.edu.stbu.jw.subjectmatch.Service.impl;

import cn.edu.stbu.jw.subjectmatch.Entity.MatchNews;
import cn.edu.stbu.jw.subjectmatch.Mapper.MatchNewsMapper;
import cn.edu.stbu.jw.subjectmatch.Service.IMatchNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MatchNewsServiceImpl implements IMatchNewsService {
    @Autowired
    MatchNewsMapper dao;

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
    public MatchNews getObjectByTitle(String title) {
        return (MatchNews) dao.getObjectByTitle(title);
    }

    @Override
    @Transactional(readOnly=true)
    public <T> T getObjectById(Long id) {
        return dao.getObjectById(id);
    }

    @Override
    @Transactional(readOnly=true)
    @Cacheable(cacheNames = {"MatchNews-listAll"})
    public <T> List<T> listAll() {
        return dao.listAll();
    }

    @Override
    @Transactional(readOnly=true)
    @Cacheable(cacheNames = {"MatchNews-limitQuery"},key = "#pageNow+'-'+#pageSize")
    public <T> List<T> limitQuery(int pageNow, int pageSize) {
        int index=(pageNow-1)*pageSize;
        return dao.limitQuery(index,pageSize);
    }

    @Override
    @Transactional(readOnly=true)
    @Cacheable(cacheNames = {"MatchNews-getAll"})
    public Integer getAll() {
        return dao.getAll();
    }
}
