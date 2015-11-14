package br.com.materdei.adouami.daos.impl;

import br.com.materdei.adouami.daos.IDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Repository
public abstract class DaoImpl<T, ID extends Serializable> implements IDao<T, ID> {

    private Class<T> persistentClass;

    @PersistenceContext(name = "darkconnection")
    protected EntityManager entityManager;
    Root<T> root;
    @SuppressWarnings("rawtypes")
    TypedQuery q;

    @SuppressWarnings("unchecked")
    public DaoImpl() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        ;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @Transactional()
    public T getById(ID id) {
        return entityManager.find(persistentClass, id);
    }

    @Transactional
    public void persist(T entity) {
        entityManager.persist(entity);
    }

    @Transactional
    public void update(T entity) {
        entityManager.merge(entity);
    }

    @Transactional
    public void delete(T entity) {
        Object o = entityManager.merge(entity);
        entityManager.remove(o);
    }

    @Transactional
    public void refresh(T entity) {
        entityManager.refresh(entity);
    }

    @Transactional()
    @SuppressWarnings("unchecked")
    public List<T> getList() {
        return entityManager.createQuery(
                "Select t from " + persistentClass.getSimpleName() + " t")
                .getResultList();
    }
}