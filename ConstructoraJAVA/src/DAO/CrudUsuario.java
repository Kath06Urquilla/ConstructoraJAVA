/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Identidades.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public interface CrudUsuario {
    
    public ArrayList<Usuario> mostrar() throws ClassNotFoundException, SQLException;
    
}
