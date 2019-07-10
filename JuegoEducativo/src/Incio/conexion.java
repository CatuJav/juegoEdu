/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Incio;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class conexion {
        Connection conect = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/juego", "root", "");
            //  JOptionPane.showMessageDialog(null,"OK CORRECTO !");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sin Conexion: Intentalo mas tarde");
        }
        return conect;
    }
}
