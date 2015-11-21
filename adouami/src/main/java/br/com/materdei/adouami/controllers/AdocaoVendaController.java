package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.AdocaoVenda;
import br.com.materdei.adouami.models.Usuario;
import br.com.materdei.adouami.services.IAdocaoVendaService;
import br.com.materdei.adouami.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */

@RestController
public class AdocaoVendaController {

    @Autowired IAdocaoVendaService adocaoVendaService;
    @Autowired IUsuarioService usuarioService;

    @RequestMapping("/adocoesvenda")
    public List<AdocaoVenda> findAllAdocaoVenda(){
        return adocaoVendaService.findAllObjects();
    }

    @RequestMapping(value = "/adocoesvenda/findById", method = RequestMethod.GET)
    public AdocaoVenda findById(@RequestParam("id") Integer id){
        return adocaoVendaService.getById(id);
    }

    @RequestMapping(value = "/adocoesvenda", method = RequestMethod.POST)
    public AdocaoVenda save(@RequestBody AdocaoVenda adocaoVenda){
        Usuario u = usuarioService.findAllObjects().get(0);
        adocaoVenda.setUsuario(u);
        adocaoVenda.setDtEmissao(new Date());
        try {
            adocaoVendaService.persist(adocaoVenda);
        } catch (Exception e){
            adocaoVendaService.update(adocaoVenda);
        }
        return adocaoVenda;
    }

    @RequestMapping(value = "/adocoesvenda/{id}", method = RequestMethod.POST)
    public AdocaoVenda update(@PathVariable("id") Integer id, @RequestBody AdocaoVenda adocaoVenda){
        try {
            adocaoVendaService.persist(adocaoVenda);
        } catch (Exception e){
            adocaoVendaService.update(adocaoVenda);
        }
        return adocaoVenda;
    }

    @RequestMapping(value = "/adocoesvenda", method = RequestMethod.DELETE)
    public AdocaoVenda delete(@RequestBody AdocaoVenda adocaoVenda){
        try {
            adocaoVendaService.delete(adocaoVenda);
        } catch (Exception e){
            return adocaoVenda;
        }
        return adocaoVenda;
    }

}
