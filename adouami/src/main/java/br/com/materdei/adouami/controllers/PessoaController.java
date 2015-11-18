package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Pessoa;
import br.com.materdei.adouami.services.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@RestController
public class PessoaController {

    @Autowired private IPessoaService pessoaService;

    @RequestMapping("/pessoas")
    public List<Pessoa> findAllPessoas(){
        return pessoaService.findAllObjects();
    }

    @RequestMapping(value = "/pessoas", method = RequestMethod.POST)
    public Pessoa save(@RequestBody Pessoa pessoa){
        try {
            pessoaService.persist(pessoa);
        } catch (Exception e){
            pessoaService.update(pessoa);
        }
        return pessoa;
    }

    @RequestMapping(value = "/pessoas/{id}", method = RequestMethod.POST)
    public Pessoa update(@PathVariable("id") Integer id, @RequestBody Pessoa pessoa){
        try {
            pessoaService.persist(pessoa);
        } catch (Exception e){
            pessoaService.update(pessoa);
        }
        return pessoa;
    }

    @RequestMapping(value = "/pessoas", method = RequestMethod.DELETE)
    public Pessoa delete(@RequestBody Pessoa pessoa){
        try {
            pessoaService.delete(pessoa);
        } catch (Exception e){
            return pessoa;
        }
        return pessoa;
    }

}
