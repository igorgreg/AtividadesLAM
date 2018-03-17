package com.example.lw.applista;

/**
 * Created by lw on 16/03/18.
 */

public class Curso {
    String nome;
    String descricao;
    int imageId;

    void setNome(String val){
        this.nome = val;
    }

    void setDescricao(String val){
        this.descricao = val;
    }

    void setImageId(int resId){this.imageId = resId;}

    String getNome(){
        return this.nome;
    }

    String getDescricao(){
        return this.descricao;
    }

    int getImageId(){return this.imageId;}
}
