package br.com.materdei.adouami.daos.impl;

import br.com.materdei.adouami.daos.IAnimalDao;
import br.com.materdei.adouami.models.Animal;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Repository
public class AnimalDaoImpl extends DaoImpl<Animal,Serializable> implements IAnimalDao {
}
