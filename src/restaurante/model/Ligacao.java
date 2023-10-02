/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.model;

/**
 *
 * @author 182210126
 */
public class Ligacao {
    private int idLigacao;
    private int fkPrato;
    private int fkCompra;

    public Ligacao(int fkPrato, int fkCompra) {
        this.fkPrato = fkPrato;
        this.fkCompra = fkCompra;
    }

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }

    public int getFkPrato() {
        return fkPrato;
    }

    public void setFkPrato(int fkPrato) {
        this.fkPrato = fkPrato;
    }

    public int getFkCompra() {
        return fkCompra;
    }

    public void setFkCompra(int fkCompra) {
        this.fkCompra = fkCompra;
    }
    
}
