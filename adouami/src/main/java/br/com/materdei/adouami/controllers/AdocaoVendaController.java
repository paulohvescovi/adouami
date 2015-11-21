package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.AdocaoVenda;
import br.com.materdei.adouami.services.IAdocaoVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/adocaoVendas", method = RequestMethod.POST)
    @Transactional
    public AdocaoVenda save(@RequestBody AdocaoVenda adocaoVenda){
        try {
            adocaoVendaService.persist(adocaoVenda);
        } catch (Exception e){
            adocaoVendaService.update(adocaoVenda);
        }
        return adocaoVenda;
    }

    @RequestMapping(value = "/adocaoVendas/{id}", method = RequestMethod.POST)
    public AdocaoVenda update(@PathVariable("id") Integer id, @RequestBody AdocaoVenda adocaoVenda){
        try {
            adocaoVendaService.persist(adocaoVenda);
        } catch (Exception e){
            adocaoVendaService.update(adocaoVenda);
        }
        return adocaoVenda;
    }

    @RequestMapping(value = "/adocaoVendas", method = RequestMethod.DELETE)
    public AdocaoVenda delete(@RequestBody AdocaoVenda adocaoVenda){
        try {
            adocaoVendaService.delete(adocaoVenda);
        } catch (Exception e){
            return adocaoVenda;
        }
        return adocaoVenda;
    }

}
