/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Identidades.Material;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge Alberto
 */
public class DaoMaterial extends Conexion implements CrudMaterial{
    PreparedStatement ps;
    ResultSet rs;
    Material p;
    int res;
//*********************************************************************************************************************************
    public ArrayList<Material> mostrar() throws ClassNotFoundException, SQLException {
        ArrayList<Material> ar=new ArrayList<Material>();
        ps=super.con().prepareStatement("select * from materiaPrima");
        try {
            rs=ps.executeQuery();
            while(rs.next()){
               p=new Material(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
               ar.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
           //ps.close();
           //rs.close();
           super.con().close();
        }
        return ar;
    }
//*********************************************************************************************************************************
    public int agregar(Material p) throws ClassNotFoundException, SQLException {
        try {
        ps=super.con().prepareStatement("insert into materiaprima(nombre, precioUnidad, existencia) values(?,?,?)");
        ps.setString(1,p.getNombre());
        ps.setDouble(2,p.getPrecioUnidad());
        ps.setInt(3,p.getExistencia());
        res=ps.executeUpdate();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
          super.con().close();
        }
        return res;
    }  
//*********************************************************************************************************************************
    public int modificar(Material p) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("update materiaprima set nombre=?,precioUnidad=?,existencia=? "
                + "where idMateriaPrima=?");
        ps.setString(1,p.getNombre());
        ps.setDouble(2,p.getPrecioUnidad());
        ps.setInt(3,p.getExistencia());
        ps.setInt(4,p.getIdMteriaPrima());
        try {
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
          super.con().close();
        }
        return res;
    }
//*********************************************************************************************************************************
    public int eliminar(Material p) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("delete from materiaprima WHERE idMateriaPrima=?");
        ps.setInt(1,p.getIdMteriaPrima());
        try {
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
          super.con().close();
        }
        return res;
    }
}
