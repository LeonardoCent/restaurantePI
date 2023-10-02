/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import restaurante.model.Carrinho;

/**
 *
 * @author 182210126
 */
public class CarrinhoDAO {

 public ArrayList<Carrinho> listarCarrinho(int codPrato, int codCompra){
         
        ArrayList<Carrinho> alCar = new ArrayList<>();
        String sql = "SELECT idcompra FROM compras WHERE idcompra = " + codCompra + "UNION SELECT idprato, prato, preco FROM pratos WHERE idprato = " +codPrato;
        ResultSet rs = Conexao.consultar(sql);
         if(rs != null){
            try{
                while(rs.next()){
                    String prato = rs.getString("prato");
                    float preco = rs.getFloat("preco");
                    int codPratoAux = rs.getInt("idprato");
                    int codCompraAux = rs.getInt("idcompra");
                    Carrinho car = new Carrinho(prato, preco, codPratoAux,codCompraAux );
                    
                    alCar.add(car);
                }
                return alCar;
            }catch(Exception e){
                
            }
        
        

     }
         return null;
}
 public void finalizarCompra(Carrinho carrinho){
        String sql = "INSERT INTO ligacao (fkprato, fkcompra) VALUES ( "
                + " " + carrinho.getCodPrato()+  " , "
                + " " + carrinho.getCodCompra()+  "  ) ";
        System.out.println(sql);
        Conexao.executar(sql);
  }
 
}
