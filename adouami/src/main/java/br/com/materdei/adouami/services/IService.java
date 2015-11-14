package br.com.materdei.adouami.services;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
public interface IService<T, ID extends Serializable> {

    void delete(T entity);

    void persist(T entity);

    void update(T entity);

    void refresh(T entity);

    List<T> findAllObjects();

    T getById(ID id);
}
