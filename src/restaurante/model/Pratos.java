/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.model;

import java.util.ArrayList;
import restaurante.dao.PratosDAO;

/**
 *
 * @author 182210126
 */
public class Pratos {
    private int idPrato;
    private String prato;
    private float preco;

    public Pratos(String prato, float preco) {
        this.prato = prato;
        this.preco = preco;
    }

    public Pratos() {
        
    }

    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
     public void cadastrarPrato (Pratos prato){
        PratosDAO praDAO = new PratosDAO();
        praDAO.cadastrarPrato(prato);
    
}
     public void excluirPrato(int idPrato){
        PratosDAO praDAO = new PratosDAO();
        
        praDAO.excluirPrato(idPrato);
    }
     public void alterarPrato(Pratos prato){
        PratosDAO praDAO = new PratosDAO();
        praDAO.alterarPrato(prato);
    }
     public ArrayList<Pratos> listarPrato(){
        PratosDAO praDAO = new PratosDAO();
        return praDAO.listarPrato();
}
}
