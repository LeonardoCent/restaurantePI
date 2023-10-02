/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.controller;

import java.util.ArrayList;
import restaurante.model.Carrinho;

/**
 *
 * @author 182210126
 */
public class CarrinhoController {

   
    public ArrayList<Carrinho> listarCarrinho(int codPrato, int codCompra){
         
             Carrinho car = new Carrinho(codPrato,codCompra);
             car.setCodCompra(codCompra);
             car.setCodPrato(codPrato);
             return car.listarCarrinho();
         
     }
    public boolean finalizarCompra(int codPrato, int codCompra){
        
        if(codPrato>0 && codCompra>0 ){
        Carrinho car = new Carrinho(codPrato, codCompra);
        car.finalizarCompra(car);
        return true;
        }return false;
    }
}
