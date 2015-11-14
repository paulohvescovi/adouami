package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Raca;
import br.com.materdei.adouami.services.IRacaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@RestController
public class RacaController {

    @Autowired private IRacaService racaService;

    @RequestMapping("/racas")
    public List<Raca> findAllRacas(){
        return racaService.findAllObjects();
    }

}
