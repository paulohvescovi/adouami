package br.com.materdei.adouami.daos.impl;

import br.com.materdei.adouami.daos.IRacaDao;
import br.com.materdei.adouami.models.Raca;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Repository
public class RacaDaoImpl extends DaoImpl<Raca,Serializable> implements IRacaDao {
}
