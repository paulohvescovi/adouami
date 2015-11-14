package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Estado;
import br.com.materdei.adouami.services.IEstadoService;
import br.com.materdei.adouami.services.impl.EstadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@RestController
public class EstadoController {

    @Autowired IEstadoService estadoService;

    @RequestMapping("estados")
    public List<Estado> findAllEstados(){
        return estadoService.findAllObjects();
    }

}
