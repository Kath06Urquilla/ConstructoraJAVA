package DAO;

import Identidades.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Nombre de la interfas CrudCliente
 * Fecha: 29-08-2019
 * Version: 1.0
 * CopyRight: Itca-Fepade
 * @author Alexis Aguilar
 */
public interface CrudCliente {
    
    public int agregarCliente(Cliente c) throws ClassNotFoundException, SQLException;
    
    
}
