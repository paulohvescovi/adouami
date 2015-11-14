package br.com.materdei.adouami.services.impl;

import br.com.materdei.adouami.daos.IUsuarioDao;
import br.com.materdei.adouami.models.Usuario;
import br.com.materdei.adouami.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Service
public class UsuarioServiceImpl extends ServiceImpl<Usuario> implements IUsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;

    @PostConstruct
    public void init() {
        super.setDaoImpl(usuarioDao);
    }
}
