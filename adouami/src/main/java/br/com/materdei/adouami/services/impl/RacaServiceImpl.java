package br.com.materdei.adouami.services.impl;

import br.com.materdei.adouami.daos.IRacaDao;
import br.com.materdei.adouami.models.Raca;
import br.com.materdei.adouami.services.IRacaService;
import br.com.materdei.adouami.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Service
public class RacaServiceImpl extends ServiceImpl<Raca> implements IRacaService {

    @Autowired
    private IRacaDao racaDao;

    @PostConstruct
    public void init() {
        super.setDaoImpl(racaDao);
    }

}
