package cn.edu.stbu.jw.subjectmatch.Myinterface;

import java.util.List;

public interface ICRUDMapper {

    void save(Object obj);

    void delete(Long id);

    void update(Object obj);

    Object getObjectByTitle(String title);

    <T> T getObjectById(Long id);

    <T> List<T> listAll();

    <T> List<T> limitQuery(int index, int pageSize);

    Integer getAll();
}
