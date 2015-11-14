package br.com.materdei.adouami.services.impl;

import br.com.materdei.adouami.daos.ICidadeDao;
import br.com.materdei.adouami.models.Cidade;
import br.com.materdei.adouami.services.ICidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Service
public class CidadeServiceImpl extends ServiceImpl<Cidade> implements ICidadeService {

    @Autowired
    private ICidadeDao cidadeDao;

    @PostConstruct
    public void init() {
        super.setDaoImpl(cidadeDao);
    }
}
