/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.model;

import java.util.ArrayList;
import restaurante.dao.CarrinhoDAO;

/**
 *
 * @author 182210126
 */
public class Carrinho {
    private String nomePrato;
    private float precoPrato;
    private int codPrato;
    private int codCompra;

    public Carrinho(String nomePrato, float precoPrato, int codPrato, int codCompra) {
        this.nomePrato = nomePrato;
        this.precoPrato = precoPrato;
        this.codPrato = codPrato;
        this.codCompra = codCompra;
    }

    public Carrinho() {
        
    }

    public Carrinho(int codPrato, int codCompra) {
       
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public float getPrecoPrato() {
        return precoPrato;
    }

    public void setPrecoPrato(float precoPrato) {
        this.precoPrato = precoPrato;
    }

    public int getCodPrato() {
        return codPrato;
    }

    public void setCodPrato(int codPrato) {
        this.codPrato = codPrato;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }
    public ArrayList<Carrinho> listarCarrinho(){
        CarrinhoDAO carDAO = new CarrinhoDAO();
        return carDAO.listarCarrinho(codPrato,codCompra);
    }
   public void finalizarCompra (Carrinho carrinho){
        CarrinhoDAO carDAO = new CarrinhoDAO();
        carDAO.finalizarCompra(carrinho);
    }
    
            
}
