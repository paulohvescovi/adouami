package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Cidade;
import br.com.materdei.adouami.models.Estado;
import br.com.materdei.adouami.services.ICidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/cidades", method = RequestMethod.POST)
    public Cidade save(@RequestBody Cidade cidade){
        try {
            cidadeService.persist(cidade);
        } catch (Exception e){
            cidadeService.update(cidade);
        }
        return cidade;
    }

    @RequestMapping(value = "/cidades/{id}", method = RequestMethod.POST)
    public Cidade update(@PathVariable("id") Integer id, @RequestBody Cidade cidade){
        try {
            cidadeService.persist(cidade);
        } catch (Exception e){
            cidadeService.update(cidade);
        }
        return cidade;
    }

//    @RequestMapping(value = "/estados", method = RequestMethod.DELETE)
//    public Cidade delete(@RequestBody Cidade cidade){
//        try {
//            cidadeService.delete(cidade);
//        } catch (Exception e){
//            return cidade;
//        }
//        return cidade;
//    }
}
