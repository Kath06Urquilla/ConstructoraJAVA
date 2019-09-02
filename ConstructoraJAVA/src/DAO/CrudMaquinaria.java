/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

//import Presentacion.*;
import java.sql.SQLException;
import java.util.ArrayList;
import Identidades.*;

/**
 *
 * @author romer
 */
public interface CrudMaquinaria {
    public ArrayList<Maquinaria>mostrar()throws ClassNotFoundException, SQLException;
    public int agregarMaquinaria(Maquinaria maq) throws ClassNotFoundException, SQLException;
    public int modificarMaquinaria(Maquinaria Maq) throws ClassNotFoundException, SQLException;
    public int eliminarMaquinaria(Maquinaria Maq) throws ClassNotFoundException, SQLException;
}
