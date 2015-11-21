package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Raca;
import br.com.materdei.adouami.models.Raca;
import br.com.materdei.adouami.services.IRacaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@RestController
public class RacaController {

    @Autowired private IRacaService racaService;

    @RequestMapping(value = "/racas", method = RequestMethod.GET)
    public List<Raca> findAllRacas(){
        return racaService.findAllObjects();
    }

    @RequestMapping(value = "/racas", method = RequestMethod.POST)
    public Raca save(@RequestBody Raca raca){
        try {
            racaService.persist(raca);
        } catch (Exception e){
            racaService.update(raca);
        }
        return raca;
    }

    @RequestMapping(value = "/racas/{id}", method = RequestMethod.POST)
    public Raca update(@PathVariable("id") Integer id, @RequestBody Raca raca){
        try {
            racaService.persist(raca);
        } catch (Exception e){
            racaService.update(raca);
        }
        return raca;
    }

    @RequestMapping(value = "/racas", method = RequestMethod.DELETE)
    public Raca delete(@RequestBody Raca raca){
        try {
            racaService.delete(raca);
        } catch (Exception e){
            return raca;
        }
        return raca;
    }

}
