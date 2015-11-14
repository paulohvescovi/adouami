package br.com.materdei.adouami.services.impl;

import br.com.materdei.adouami.daos.IAnimalDao;
import br.com.materdei.adouami.daos.IEstadoDao;
import br.com.materdei.adouami.models.Animal;
import br.com.materdei.adouami.services.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Service
public class AnimalServiceImpl extends ServiceImpl<Animal> implements IAnimalService {

    @Autowired
    private IAnimalDao animalDao;

    @PostConstruct
    public void init() {
        super.setDaoImpl(animalDao);
    }
}
