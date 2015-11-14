package br.com.materdei.adouami.controllers;

import br.com.materdei.adouami.models.Usuario;
import br.com.materdei.adouami.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@RestController
public class UsuarioController {

    @Autowired IUsuarioService usuarioService;

    @RequestMapping("/usuarios")
    public List<Usuario> findAllUsuarios(){
        return usuarioService.findAllObjects();
    }

}
