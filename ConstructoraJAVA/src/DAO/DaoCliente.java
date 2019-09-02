package DAO;

import Identidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: DaoCliente
 * Fecha: 29-08-2019
 * Version: 1.0
 * CopyRight: Itca-Fepade
 * @author Alexis Aguilar
 */
public class DaoCliente extends Conexion implements CrudCliente{
    
    PreparedStatement ps;   //para sentencias SQL
    ResultSet rs;           //para los resultados que recibe
    Cliente c;              //para crear clientes
    int res;
            
    //Para agregar Usuarios y clientes
    @Override
    public int agregarCliente(Cliente c) throws ClassNotFoundException, SQLException{
    
        try {
            ps = super.con().prepareStatement("INSERT INTO usuario(usuario, correo,"
                    + " contraseña, rol) VALUES (?,?,?,'Cliente')");
            ps.setString(1, c.getUsuario());
            ps.setString(2, c.getCorreo());
            ps.setString(3, c.getContraseña());
            res = ps.executeUpdate();
            
            ps = super.con().prepareStatement("INSERT INTO cliente(nombre, direccion,"
                    + " telefono, dui, fechaNacimiento, idUsuario, estado) "
                    + "VALUES (?,?,?,?,?,(select idUsuario from usuario order by idUsuario DESC limit 1),1)");
            
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDireccion());
            ps.setString(3, c.getTelefono());
            ps.setString(4, c.getDui());
            ps.setString(5, c.getFechaNacimiento());
            
            res = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            super.con().close();
        }
    
        return res;
    }
    
    //usuario ya existe
    public int existeUsuario(String usuario){    
        
        PreparedStatement ps = null;
        ResultSet rs = null;
          
        try {
             ps = super.con().prepareStatement("select count(idUsuario) from usuario where usuario=?");
             ps.setString(1, usuario);
             rs = ps.executeQuery();
             
             if(rs.next()){
                 return rs.getInt(1);
             }
             
             return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 1;
        }
    
    }
    
    //Login
    public boolean login(Cliente usr){    
        
        PreparedStatement ps = null;
        ResultSet rs = null;
          
        try {
             ps = super.con().prepareStatement("select idUsuario, usuario, correo,"
                     + "contraseña, rol from usuario where usuario=?");
             ps.setString(1, usr.getUsuario());
             rs = ps.executeQuery();
             
             if(rs.next()){
                if(usr.getContraseña().equals(rs.getString(4))){
                    usr.setIdUsuario(rs.getInt(1));
                    usr.setCorreo(rs.getString(3));
                    usr.setRol(rs.getString(5));                   
                    return true;
                }else{
                    return false;
                }
             }
             
             return false;
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    
    }
    
}
