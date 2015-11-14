package br.com.materdei.adouami.services.impl;

import br.com.materdei.adouami.daos.IDao;
import br.com.materdei.adouami.services.IService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@org.springframework.stereotype.Service
public class ServiceImpl<T extends Object> implements IService<T, Serializable> {

    private IDao<T, Serializable> dao;

    @Override
    public List<T> findAllObjects() {
        return dao.getList();
    }

    @Override
    public void delete(T bean) {
        dao.delete(bean);
    }

    @Override
    public void persist(T bean) {
        dao.persist(bean);
    }

    @Override
    public void update(T bean) {
        dao.update(bean);
    }

    @Override
    public T getById(Serializable id) {
        return dao.getById(id);
    }

    @Override
    public void refresh(T entity) {
        dao.refresh(entity);
    }

    public IDao<T, Serializable> getDaoImpl() {
        return dao;
    }

    public void setDaoImpl(IDao<T, Serializable> dao) {
        this.dao = dao;
    }
}
