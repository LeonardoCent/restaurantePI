/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.controller;
import restaurante.model.Clientes;
import java.util.ArrayList;
/**
 *
 * @author 182210126
 */
public class ClienteController {
    public boolean cadastrarCliente(String nome, String cpf,String telefone, String endereco){
        
        if(nome!=null && nome.length()>0 && cpf!=null && cpf.length()>0 && telefone!=null && telefone.length()>0 && endereco!=null && endereco.length()>0){
        Clientes cli = new Clientes(nome, cpf, telefone, endereco);
        cli.cadastrarCliente(cli);
        return true;
        }return false;
    }
     public boolean alterarCliente(int idCliente, String nome, String cpf,String telefone, String endereco){
        
        if(idCliente>0 && nome!=null && nome.length()>0 && cpf!=null && cpf.length()>0 && telefone!=null && telefone.length()>0 && endereco!=null && endereco.length()>0){
        Clientes cli = new Clientes(nome, cpf, telefone, endereco);
        cli.setIdCliente(idCliente);
        cli.alterarCliente(cli);
        return true;
        }return false;
    }
     public void excluirCliente(int idCliente){
        
        if(idCliente>0){
        Clientes cli = new Clientes();
        cli.excluirCliente(idCliente);
        
        }
    }
     public ArrayList<Clientes> listarCliente(){
         
             Clientes cli = new Clientes();
             return cli.listarCliente();
         
     }
}
