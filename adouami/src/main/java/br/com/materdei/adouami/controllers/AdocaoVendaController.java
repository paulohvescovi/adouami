package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.AdocaoVenda;
import br.com.materdei.adouami.services.IAdocaoVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */

@RestController
public class AdocaoVendaController {

    @Autowired IAdocaoVendaService adocaoVendaService;

    @RequestMapping("/adocoesvendas")
    public List<AdocaoVenda> findAllAdocaoVenda(){
        return adocaoVendaService.findAllObjects();
    }

    @RequestMapping(value = "/adocoesvendas/findById", method = RequestMethod.GET)
    public AdocaoVenda findById(@RequestParam("id") Integer id){
        return adocaoVendaService.getById(id);
    }

}
