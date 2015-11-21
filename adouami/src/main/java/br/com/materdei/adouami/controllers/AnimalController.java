package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Animal;
import br.com.materdei.adouami.services.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/animais", method = RequestMethod.POST)
    public Animal save(@RequestBody Animal animal){
        try {
            animalService.persist(animal);
        } catch (Exception e){
            animalService.update(animal);
        }
        return animal;
    }

    @RequestMapping(value = "/animais/{id}", method = RequestMethod.POST)
    public Animal update(@PathVariable("id") Integer id, @RequestBody Animal animal){
        try {
            animalService.persist(animal);
        } catch (Exception e){
            animalService.update(animal);
        }
        return animal;
    }

    @RequestMapping(value = "/animais", method = RequestMethod.DELETE)
    public Animal delete(@RequestBody Animal animal){
        try {
            animalService.delete(animal);
        } catch (Exception e){
            return animal;
        }
        return animal;
    }


}
