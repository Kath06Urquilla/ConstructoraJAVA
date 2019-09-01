/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Identidades.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge Alberto
 */
public class DaoEmpleado extends Conexion implements CrudEmpleado{
    PreparedStatement ps;       //para sentencias sql
    ResultSet rs;               //para resultados que va a devolver
    Empleado em;                 //para crear empleados
    int res;

    @Override
    public ArrayList<Empleado> mostrar() throws ClassNotFoundException, SQLException {
    ArrayList<Empleado> ar=new ArrayList<Empleado>();
       /* try {
            //ps=super.con().prepareStatement("select * from empleado where estado=1");
            ps=super.con().prepareStatement("select e.idEmpleado, e.nombre, e.direccion, "
                    + "e.telefono, e.dui, e.fechaNacimiento, e.tipoEmpleado, e.pagoDia, "
                    + "u.usuario, u.correo, u.contraseña, u.avatar FROM empleado e "
                    + "INNER JOIN usuario u ON e.idUsuario = u.idUsuario where e.estado=1");
            rs=ps.executeQuery();
            while(rs.next()){
                em=new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8), rs.getString(9), rs.getString(10),rs.getString(11), rs.getString(12),rs.getDouble(13));
                ar.add(em);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
      
        }finally{
            super.con().close();
        }*/
        return ar;
    }

    @Override
    public int agregarEmpleado(Empleado em) throws ClassNotFoundException, SQLException {
        try {
            ps = super.con().prepareStatement("INSERT INTO usuario(usuario, correo,"
                    + " contraseña, avatar, rol) VALUES (?,?,?,?,'Empleado')");
            ps.setString(1, em.getUsuario());
            ps.setString(2, em.getCorreo());
            ps.setString(3, em.getContraseña());
            ps.setString(4, em.getAvatar());
            res = ps.executeUpdate();
            
            ps=super.con().prepareStatement("insert into empleado(nombre, direccion,"
                    + " telefono, dui,fechaNacimiento, tipoEmpleado,pagoDia, "
                    + "idUsuario,estado) values(?,?,?,?,?,?,?,(select idUsuario from usuario order by idUsuario DESC limit 1),1)");
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getDireccion());
            ps.setString(3, em.getTelefono());
            ps.setString(4, em.getDui());
            ps.setString(5, em.getFechaNacimiento());
            ps.setString(6, em.getTipoEmpleado());
            ps.setDouble(7, em.getPagoDia());
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            super.con().close();
        }
        return res;
    }

    @Override
    public int modificarEmpleado(Empleado em) throws ClassNotFoundException, SQLException {
        try {
            ps=super.con().prepareStatement("update empleado set nombre=?, direccion=?,"
                    + " telefono=?, dui=?,fechaNacimiento=?, tipoEmpleado=?,pagoDia=?, "
                    + "idUsuario=? where idEmpleado=?");
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getDireccion());
            ps.setString(3, em.getTelefono());
            ps.setString(4, em.getDui());
            ps.setString(5, em.getFechaNacimiento());
            ps.setString(6, em.getTipoEmpleado());
            ps.setDouble(7, em.getPagoDia());
          //  ps.setString(8, em.getIdUsuario());
            ps.setInt(9, em.getIdEmpleado());
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            super.con().close();
        }
        return res;
    }

    @Override
    public int eliminarEmpleado(Empleado em) throws ClassNotFoundException, SQLException {
     try {
            ps=super.con().prepareStatement("update empleado set estado=0 where idEmpleado=?");
           // ps=super.con().prepareStatement("delete from empleado where idEmpleado=?");
            ps.setInt(1, em.getIdEmpleado());
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            super.con().close();
        }
        return res;
    }
}
