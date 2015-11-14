package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Pessoa;
import br.com.materdei.adouami.services.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@RestController
public class PessoaController {

    @Autowired private IPessoaService pessoaService;

    @RequestMapping("/pessoas")
    public List<Pessoa> findAllPessoas(){
        return pessoaService.findAllObjects();
    }

}
