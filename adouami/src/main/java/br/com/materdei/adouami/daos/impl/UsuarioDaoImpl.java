package br.com.materdei.adouami.daos.impl;

import br.com.materdei.adouami.daos.IUsuarioDao;
import br.com.materdei.adouami.models.Usuario;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Repository
public class UsuarioDaoImpl extends DaoImpl<Usuario,Serializable> implements IUsuarioDao {
}
