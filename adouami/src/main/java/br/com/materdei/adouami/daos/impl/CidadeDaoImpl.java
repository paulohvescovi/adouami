package br.com.materdei.adouami.daos.impl;

import br.com.materdei.adouami.daos.ICidadeDao;
import br.com.materdei.adouami.models.Cidade;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Repository
public class CidadeDaoImpl extends DaoImpl<Cidade,Serializable> implements ICidadeDao {
}
