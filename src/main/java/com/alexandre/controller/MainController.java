package com.alexandre.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alexandre.controller.obj.Usuario;

@RestController
@RequestMapping("/req")
public class MainController {
    
    public static Usuario u = new Usuario();
    
    @CrossOrigin(origins = "*")
    @GetMapping
    public Usuario helloWorld(@RequestParam(required = false, defaultValue = "") String name) {
        u.setId(u.getId()+1);
        u.setNome(name);
        Usuario user = new Usuario(u.getId(), u.getNome());
        System.out.println("id:"+u.getId()+" - name:"+u.getNome());
        return user;
    }
}
