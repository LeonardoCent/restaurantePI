/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.model;
import restaurante.dao.ClienteDAO;
import java.util.ArrayList;
/**
 *
 * @author 182210126
 */
public class Clientes {
    private int idCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    public Clientes(String nome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Clientes() {
        
    }

   

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void cadastrarCliente (Clientes cliente){
        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.cadastrarCliente(cliente);
    }
    public void alterarCliente(Clientes cliente){
        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.alterarCliente(cliente);
    }
    public void excluirCliente(int idCliente){
        ClienteDAO cliDAO = new ClienteDAO();
        
        cliDAO.excluirCliente(idCliente);
    }
    public ArrayList<Clientes> listarCliente(){
        ClienteDAO cliDAO = new ClienteDAO();
        return cliDAO.listarCliente();
    }
}
