package br.com.materdei.adouami.services.impl;

import br.com.materdei.adouami.daos.IEstadoDao;
import br.com.materdei.adouami.models.Estado;
import br.com.materdei.adouami.services.IEstadoService;
import br.com.materdei.adouami.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Service
public class EstadoServiceImpl extends ServiceImpl<Estado> implements IEstadoService {

    @Autowired
    private IEstadoDao estadoDao;

    @PostConstruct
    public void init() {
        super.setDaoImpl(estadoDao);
    }

}
