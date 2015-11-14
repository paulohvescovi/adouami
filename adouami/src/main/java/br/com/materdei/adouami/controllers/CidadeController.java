package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Cidade;
import br.com.materdei.adouami.services.ICidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@RestController
public class CidadeController {

    @Autowired private ICidadeService cidadeService;

    @RequestMapping("/cidades")
    public List<Cidade> findAllCidades(){
        return cidadeService.findAllObjects();
    }
}
