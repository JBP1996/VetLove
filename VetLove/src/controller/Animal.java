/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;

/**
 *
 * @author JBP1996 Atec
 */
public class Animal {
    private String classificacao;
    private String raca;
    private Date data_nascimento;
    Ficha fi = new Ficha();

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Ficha getFi() {
        return fi;
    }

    public void setFi(Ficha fi) {
        this.fi = fi;
    }
    
    public Animal(){
        
    }
}
