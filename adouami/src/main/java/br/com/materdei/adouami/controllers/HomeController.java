package br.com.materdei.adouami.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "Software para controle de adoção de animais (Developed by Paulo Henrique Vescovi)";
    }
}
