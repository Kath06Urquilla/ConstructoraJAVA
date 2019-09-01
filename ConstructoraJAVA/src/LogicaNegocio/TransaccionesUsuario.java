/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import DAO.DaoUsuario;
import Identidades.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Nombre de la clase: TransaccionesUsuario
 * Fecha: 01-09-2019
 * Version: 1.0
 * CopyRight: Itca-Fepade
 * @author Alexis Aguilar
 */
public class TransaccionesUsuario {
    
    DaoUsuario ob = new DaoUsuario();
    Usuario u;
    int res = 0;
    
    //Para mostrar todos los usuarios
    public DefaultTableModel mostrar(){
    
        ArrayList<Usuario> ar = new ArrayList<Usuario>();
        
        String[] titulos = {"ID","Usuario","Correo","Rol"};
        DefaultTableModel tm = new DefaultTableModel(titulos,0);
        
        try {
            ar.addAll(ob.mostrar());
            Object [] vec = new Object[4];
            for(Usuario v:ar){
                vec[0] = v.getIdUsuario();
                vec[1] = v.getUsuario();
                vec[2] = v.getCorreo();
                vec[3] = v.getRol();
                tm.addRow(vec);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return tm;        
    }
    
    
    
}
