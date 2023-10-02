/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.dao;
import restaurante.model.Clientes;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author 182210126
 */
public class ClienteDAO {
    //Clientes cli = new Clientes();
    
     public void cadastrarCliente(Clientes cliente){
        String sql = "INSERT INTO clientes (nome, cpf, telefone, endereco) VALUES ( "
                + " '" + cliente.getNome() +  "' , "
                + " '" + cliente.getCpf() +  " ' , "
                + " '" + cliente.getTelefone() +  " ' , "
                + " '" + cliente.getEndereco() + "  ') ";
            
        Conexao.executar(sql);
}
     public void alterarCliente(Clientes cliente){
         String sql = "UPDATE clientes SET "
                + "nome  = '" + cliente.getNome() + " ' ,"
                + "cpf  = '" + cliente.getCpf() + " ' ,"
                + "telefone  = '" + cliente.getTelefone() + " ' ,"
                + "endereco  = '" + cliente.getEndereco() + " '  "
                + "WHERE idcliente = " + cliente.getIdCliente();
        Conexao.executar(sql);
     }
     public static void excluirCliente(int idCliente){
         String sql = "DELETE FROM clientes WHERE idcliente = " + idCliente;
         
         Conexao.executar(sql);
         
     }
     public ArrayList<Clientes> listarCliente(){
         
        ArrayList<Clientes> alCli = new ArrayList<>();
        String sql = "SELECT idcliente, nome, cpf, telefone, endereco FROM clientes ORDER BY nome";
        ResultSet rs = Conexao.consultar(sql);
         if(rs != null){
            try{
                while(rs.next()){
                    String nomeAux = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    String telefone = rs.getString("telefone");
                    String endereco = rs.getString("endereco");
                    Clientes cli = new Clientes(nomeAux, cpf, telefone, endereco);
                    cli.setIdCliente(rs.getInt("idcliente"));
                    alCli.add(cli);
                }
                return alCli;
            }catch(Exception e){
                
            }
        
        

     }
         return null;
}
}
