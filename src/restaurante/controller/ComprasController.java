/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.controller;

import java.util.ArrayList;
import restaurante.model.Compras;

/**
 *
 * @author 182210126
 */
public class ComprasController {
    

 public boolean cadastrarCompra(float preco, String formaDePagamento,int fkCliente){
        
        if(preco>0.0f && formaDePagamento!=null && formaDePagamento.length()>0 && fkCliente>0){
            Compras comp = new Compras(preco, formaDePagamento, fkCliente);
            comp.cadastrarCompra(comp);
            return true;
        }
        return false;
    }
 public boolean alteraCompra(int idCompra, float preco, String formaDePagamento,int fkCliente){
        
        if(idCompra>0 && preco>0.0f && formaDePagamento!=null && formaDePagamento.length()>0 && fkCliente>0){
           Compras comp = new Compras(preco, formaDePagamento, fkCliente);
           comp.setIdCompra(idCompra);
           comp.alteraCompra(comp);
           return true;
        }
        return false;
}
 public void excluirCompra(int idCompra){
        
        if(idCompra>0){
        Compras comp = new Compras();
        comp.excluirCompra(idCompra);
        
        }
    }
 public ArrayList<Compras> listarCompra(){
         
             Compras comp = new Compras();
             return comp.listarCompra();
         
     }
}
