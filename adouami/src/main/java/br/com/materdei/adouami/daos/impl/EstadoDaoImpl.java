package br.com.materdei.adouami.daos.impl;

import br.com.materdei.adouami.daos.IEstadoDao;
import br.com.materdei.adouami.models.Estado;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Repository
public class EstadoDaoImpl extends DaoImpl<Estado,Serializable> implements IEstadoDao {
}
