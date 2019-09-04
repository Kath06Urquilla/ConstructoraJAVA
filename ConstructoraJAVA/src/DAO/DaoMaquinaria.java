/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Identidades.Maquinaria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author romer
 */
public class DaoMaquinaria extends Conexion implements CrudMaquinaria{
    PreparedStatement ps;       //para sentencias sql
    ResultSet rs;               //para resultados que va a devolver
    Maquinaria maq;                 //para crear productos
    int res;

    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public ArrayList<Maquinaria> mostrar() throws ClassNotFoundException, SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       ArrayList<Maquinaria> ar=new ArrayList<Maquinaria>();
        try {
            ps=super.con().prepareStatement("select * from maquinaria");
            rs=ps.executeQuery();
            while(rs.next()){
                maq=new Maquinaria(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6));
                ar.add(maq);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());      
        }finally{
            super.con().close();
        }
        return ar;
    }

    @Override
    public int agregarMaquinaria(Maquinaria maq) throws ClassNotFoundException, SQLException{
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try {
            ps=super.con().prepareStatement("insert into maquinaria(nombre, tipoMaquinaria, marca, precioDia, existencia, estado) values(?,?,?,?,?,1)");
            ps.setString(1, maq.getNombre());
            ps.setString(2, maq.getTipoMaquinaria());
            ps.setString(3, maq.getMarca());
            ps.setDouble(4, maq.getPrecioDia());
            ps.setInt(5, maq.getExistencia());
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
    public int modificarMaquinaria(Maquinaria Maq) throws ClassNotFoundException, SQLException{
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            ps=super.con().prepareStatement("update maquinaria set nombre=?,tipoMaquinaria=?,marca=?,precioDia=?,existencia=? where idMaquinaria=?");
            
            ps.setString(1, Maq.getNombre());
            ps.setString(2, Maq.getTipoMaquinaria());
            ps.setString(3, Maq.getMarca());
            ps.setDouble(4, Maq.getPrecioDia());
            ps.setInt(5, Maq.getExistencia());
            ps.setInt(6,  Maq.getIdMaquinaria());
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
    public int eliminarMaquinaria(Maquinaria Maq) throws ClassNotFoundException, SQLException{
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            ps=super.con().prepareStatement("delete from maquinaria where idMaquinaria=?");
            
            ps.setInt(1, Maq.getIdMaquinaria());
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
