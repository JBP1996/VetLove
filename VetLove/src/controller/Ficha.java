/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author JBP1996 Atec
 */
public class Ficha{
    private ArrayList<Vacina> vac;
    private ArrayList<Consulta> con;

    public ArrayList<Vacina> getVac() {
        return vac;
    }

    public void setVac(ArrayList<Vacina> vac) {
        this.vac = vac;
    }

    public ArrayList<Consulta> getCon() {
        return con;
    }

    public void setCon(ArrayList<Consulta> con) {
        this.con = con;
    }
    
         
}
