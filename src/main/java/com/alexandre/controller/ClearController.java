package com.alexandre.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandre.controller.obj.Usuario;

@RestController
@RequestMapping("/clear")
public class ClearController {
    
    @CrossOrigin(origins = "*")
    @GetMapping
    public Usuario clear() {
        MainController.u.setId(0);
        MainController.u.setNome(null);
        System.out.println("id:"+MainController.u.getId()+" - name:"+MainController.u.getNome());
        return MainController.u;
    }
    
}
