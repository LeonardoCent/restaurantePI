/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import restaurante.view.JfRestaurante;
import javax.swing.JFrame;
/**
 *
 * @author 182210126
 */
public class Restaurante extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JfRestaurante r = new JfRestaurante();
        r.setVisible(true);
        r.setSize(652,753);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
