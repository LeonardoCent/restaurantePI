/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import restaurante.model.Compras;

/**
 *
 * @author 182210126
 */
public class ComprasDAO {
  public void cadastrarCompra(Compras compra){
        String sql = "INSERT INTO compras (preco, formadepagamento, fkcliente) VALUES ( "
                + " " + compra.getPreco()+  " , "
                + " '" + compra.getFormaDePagamento()+  " ' , "
                + " " + compra.getFkCliente()+  "   )";
        System.out.println(sql);
        Conexao.executar(sql);
  }
  public void alteraCompra(Compras compra){
         String sql = "UPDATE compras SET "
                + "preco  = " + compra.getPreco()+ "  ,"
                + "formadepagamento  = '" + compra.getFormaDePagamento()+ "' ,"
                + "fkcliente  = " + compra.getFkCliente()+ "  "
                + "WHERE idcompra = " + compra.getIdCompra();
         System.out.println(sql);
        Conexao.executar(sql);
     }
   public static void excluirCompra(int idCompra){
         String sql = "DELETE FROM compras WHERE idcompra = " + idCompra;
         
         Conexao.executar(sql);
         
     }
    public ArrayList<Compras> listarCompra(){
         
        ArrayList<Compras> alCom = new ArrayList<>();
        String sql = "SELECT idcompra, preco, formadepagamento, fkcliente FROM compras ORDER BY idcompra";
        ResultSet rs = Conexao.consultar(sql);
         if(rs != null){
            try{
                while(rs.next()){
                    float preco = rs.getFloat("preco");
                    String formaDePagamento = rs.getString("formadepagamento");
                    int fkCliente = rs.getInt("fkcliente");
                    Compras comp = new Compras(preco, formaDePagamento, fkCliente);
                    comp.setIdCompra(rs.getInt("idcompra"));
                    alCom.add(comp);
                }
                return alCom;
            }catch(Exception e){
                
            }
        
        

     }
         return null;
}
}
