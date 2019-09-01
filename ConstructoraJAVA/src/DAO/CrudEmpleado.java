/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Identidades.Empleado;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jorge Alberto
 */
public interface CrudEmpleado {
    public ArrayList<Empleado>mostrar()throws ClassNotFoundException, SQLException;
    public int agregarEmpleado(Empleado em) throws ClassNotFoundException, SQLException;
    public int modificarEmpleado(Empleado em) throws ClassNotFoundException, SQLException;
    public int eliminarEmpleado(Empleado em) throws ClassNotFoundException, SQLException;
}
