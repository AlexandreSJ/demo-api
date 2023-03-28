package com.alexandre.controller.obj;

public class Usuario {

    public Integer id = 0;
    public String nome;

    public Usuario() {}
    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
