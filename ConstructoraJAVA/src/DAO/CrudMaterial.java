/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Identidades.Empleado;
import Identidades.Material;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jorge Alberto
 */
public interface CrudMaterial {
     public ArrayList<Material>mostrar()throws ClassNotFoundException, SQLException;
    public int agregar(Material p) throws ClassNotFoundException, SQLException;
    public int modificar(Material em) throws ClassNotFoundException, SQLException;
    public int eliminar(Material em) throws ClassNotFoundException, SQLException;
}
