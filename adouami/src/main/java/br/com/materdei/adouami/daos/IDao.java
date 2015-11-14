package br.com.materdei.adouami.daos;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
public interface IDao<T, ID extends Serializable> {

    T getById(ID id);

    void persist(T entity);

    void update(T entity);

    void delete(T entity);

    void refresh(T entity);

    List<T> getList();

}