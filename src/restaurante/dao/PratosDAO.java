/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import restaurante.model.Pratos;

/**
 *
 * @author 182210126
 */
public class PratosDAO {
    public void cadastrarPrato(Pratos prato){
        String sql = "INSERT INTO pratos (prato, preco) VALUES ( "
                + " '" + prato.getPrato()+  "' , "
                + "  " + prato.getPreco()+  "  ) ";
            
        Conexao.executar(sql);
}
     public static void excluirPrato(int idPrato){
         String sql = "DELETE FROM pratos WHERE idprato = " + idPrato;
         
         Conexao.executar(sql);
         
     }
     public void alterarPrato(Pratos prato){
         String sql = "UPDATE pratos SET "
                + "prato  = '" + prato.getPrato()+ " ' ,"
                + "preco  = " + prato.getPreco()+ "  "
                + "WHERE idprato = " + prato.getIdPrato();
         System.out.println(sql);
        Conexao.executar(sql);
     }
      public ArrayList<Pratos> listarPrato(){
         
        ArrayList<Pratos> alPra = new ArrayList<>();
        String sql = "SELECT idprato, prato, preco FROM pratos ORDER BY prato";
        ResultSet rs = Conexao.consultar(sql);
         if(rs != null){
            try{
                while(rs.next()){
                    String prato = rs.getString("prato");
                    float preco = rs.getFloat("preco");
                    Pratos pra = new Pratos(prato, preco);
                    pra.setIdPrato(rs.getInt("idprato"));
                    alPra.add(pra);
                }
                return alPra;
            }catch(Exception e){
                
            }
        
        

     }
         return null;
}
}
