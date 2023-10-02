/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.model;

import java.util.ArrayList;
import restaurante.dao.ComprasDAO;

/**
 *
 * @author 182210126
 */
public class Compras {
    private int idCompra;
    private float preco;
    private String formaDePagamento;
    private int fkCliente;

    public Compras(float preco, String formaDePagamento, int fkCliente) {
        this.preco = preco;
        this.formaDePagamento = formaDePagamento;
        this.fkCliente = fkCliente;
    }

    public Compras() {
       
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(int fkCliente) {
        this.fkCliente = fkCliente;
    }
    public void cadastrarCompra (Compras compra){
        ComprasDAO comDAO = new ComprasDAO();
        comDAO.cadastrarCompra(compra);
    }
    public void alteraCompra(Compras compra){
        ComprasDAO comDAO = new ComprasDAO();
        comDAO.alteraCompra(compra);
    
}
    public void excluirCompra(int idCompra){
        ComprasDAO comDAO = new ComprasDAO();
        
        comDAO.excluirCompra(idCompra);
}
    public ArrayList<Compras> listarCompra(){
        ComprasDAO comDAO = new ComprasDAO();
        return comDAO.listarCompra();
}
}
