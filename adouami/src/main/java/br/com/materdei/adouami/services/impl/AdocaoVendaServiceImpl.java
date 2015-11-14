package br.com.materdei.adouami.services.impl;

import br.com.materdei.adouami.daos.IAdocaoVendaDao;
import br.com.materdei.adouami.models.AdocaoVenda;
import br.com.materdei.adouami.services.IAdocaoVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Service
public class AdocaoVendaServiceImpl extends ServiceImpl<AdocaoVenda> implements IAdocaoVendaService {

    @Autowired
    private IAdocaoVendaDao adocaoVendaDao;

    @PostConstruct
    public void init() {
        super.setDaoImpl(adocaoVendaDao);
    }

}
