package br.com.materdei.adouami.daos.impl;

import br.com.materdei.adouami.daos.IPessoaDao;
import br.com.materdei.adouami.models.Pessoa;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Repository
public class PessoaDaoImpl extends DaoImpl<Pessoa,Serializable> implements IPessoaDao {
}
