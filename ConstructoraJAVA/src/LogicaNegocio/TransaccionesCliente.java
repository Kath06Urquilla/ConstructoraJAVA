package LogicaNegocio;

import DAO.DaoCliente;
import Identidades.Cliente;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: TrasaccionesCliente
 * Fecha: 29-08-2019
 * Version: 1.0
 * CopyRight: Itca-Fepade
 * @author Alexis Aguilar
 */
public class TransaccionesCliente {
    
    DaoCliente ob = new DaoCliente();   //instanciamos a DaoCliente
    Cliente c;
    int res = 0;
    
    
    //Para agregar clientes
    public void agregar(String usuario, String correo, String contraseña, String avatar, 
            String nombre, String direccion, String telefono, String dui, String fechaNacimiento){
    
        try {
            c = new Cliente(usuario, correo, contraseña, avatar, nombre, direccion, telefono, dui, fechaNacimiento);
            res = ob.agregarCliente(c);
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "Se agrego el cliente correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se agrego el cliente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    
    }
    
}
