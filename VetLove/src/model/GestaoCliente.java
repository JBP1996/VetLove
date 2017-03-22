/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Cliente;
import java.util.ArrayList;

/**
 *
 * @author JBP1996 Atec
 */
public class GestaoCliente {
    ArrayList<Cliente> clientes;
    
    public GestaoCliente() {
    }

    public void inserirCliente(){
        
        System.out.println("Insira o nome do cliente");
        System.out.println("Insira o morada do cliente");
        System.out.println("Insira o email do cliente");
        System.out.println("Insira o telefone do cliente");
        
        clientes.add(cliente);
        
    }
}
