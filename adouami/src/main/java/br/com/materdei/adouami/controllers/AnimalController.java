package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Animal;
import br.com.materdei.adouami.services.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@RestController
public class AnimalController {

    @Autowired private IAnimalService animalService;

    @RequestMapping("/animais")
    public List<Animal> findAllAnimais(){
        return animalService.findAllObjects();
    }


}
