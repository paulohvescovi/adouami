package br.com.materdei.adouami.services.impl;

import br.com.materdei.adouami.daos.IPessoaDao;
import br.com.materdei.adouami.models.Pessoa;
import br.com.materdei.adouami.services.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Service
public class PessoaServiceImpl extends ServiceImpl<Pessoa> implements IPessoaService {

    @Autowired
    private IPessoaDao pessoaDao;

    @PostConstruct
    public void init() {
        super.setDaoImpl(pessoaDao);
    }

}
