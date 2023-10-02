/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.controller;

import java.util.ArrayList;
import restaurante.model.Pratos;

/**
 *
 * @author 182210126
 */
public class PratosController {
    public boolean cadastrarPrato(String prato, float precoPrato){
        
        if(prato!=null && prato.length()>0 && precoPrato>0.0f){
            Pratos pra = new Pratos(prato, precoPrato);
            pra.cadastrarPrato(pra);
            return true;
        }
        return false;
    }
     public void excluirPrato(int idPrato){
        
        if(idPrato>0){
        Pratos pra = new Pratos();
        pra.excluirPrato(idPrato);
        
        }
    
}
     public boolean alterarPrato(int idPrato,String prato , float precoPrato){
        
        if(idPrato>0 && precoPrato>0.0f && prato!=null && prato.length()>0){
           Pratos pra = new Pratos(prato, precoPrato);
           pra.setIdPrato(idPrato);
           pra.alterarPrato(pra);
           return true;
        }
        return false;
}
     public ArrayList<Pratos> listarPrato(){
         
             Pratos pra = new Pratos();
             return pra.listarPrato();
         
     }
}
