package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Estado;
import br.com.materdei.adouami.services.IEstadoService;
import br.com.materdei.adouami.services.impl.EstadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@RestController
public class EstadoController {

    @Autowired IEstadoService estadoService;

    @RequestMapping(value = "estados", method = RequestMethod.GET)
    public List<Estado> findAllEstados(){
        return estadoService.findAllObjects();
    }


    @RequestMapping(value = "/estados", method = RequestMethod.POST)
    public Estado save(@RequestBody Estado estado){
        try {
            estadoService.persist(estado);
        } catch (Exception e){
            estadoService.update(estado);
        }
        return estado;
    }

    @RequestMapping(value = "/estados/{id}", method = RequestMethod.POST)
    public Estado update(@PathVariable("id") Integer id, @RequestBody Estado estado){
        try {
            estadoService.persist(estado);
        } catch (Exception e){
            estadoService.update(estado);
        }
        return estado;
    }

    @RequestMapping(value = "/estados", method = RequestMethod.DELETE)
    public Estado delete(@RequestBody Estado estado){
        try {
            estadoService.delete(estado);
        } catch (Exception e){
            return estado;
        }
        return estado;
    }

}
