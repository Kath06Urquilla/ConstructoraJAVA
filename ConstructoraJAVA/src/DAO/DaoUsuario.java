/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Identidades.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: DaoUsuario
 * Fecha: 01-09-2019
 * Version: 1.0
 * CopyRight: Itca-Fepade
 * @author Alexis Aguilar
 */
public class DaoUsuario extends Conexion implements CrudUsuario{
    
    PreparedStatement ps;
    ResultSet rs;
    Usuario u;
    int res;
    
    //Mostrar todos los usuarios
   @Override
   public ArrayList<Usuario> mostrar()throws ClassNotFoundException, SQLException{
   
       ArrayList<Usuario> fa = new ArrayList<Usuario>();
       
       try {
           
           ps = super.con().prepareStatement("select idUsuario, usuario, correo, rol from usuario");
           rs = ps.executeQuery();
           
           while(rs.next()){
               u = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
               fa.add(u);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       } finally {
           super.con().close();
       }
       
       return fa;
   }
    
}
