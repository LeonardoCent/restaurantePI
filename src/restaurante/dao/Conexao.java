/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 182210126
 */
public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/restaurante_uc9";
    private static final String USER = "root";
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SENHA = "";
    
    public static void executar (String query){
        try{
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            st.execute(query);
            conn.close();
         
        } catch(Exception e){
             JOptionPane.showMessageDialog(null, e.toString());
          }
            
     }
    public static ResultSet consultar(String query){
        try{
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
        
    }
    
}
