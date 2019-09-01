/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import DAO.DaoEmpleado;
import Identidades.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorge Alberto
 */
public class TransaccionesEmpleado {
    Empleado em;
    int res=0;
    DaoEmpleado ob=new DaoEmpleado();
    public DefaultTableModel mostrar(){
        ArrayList<Empleado> ar=new ArrayList<Empleado>();
        String[] title={"USUARIO", "CORREO","PASSWORD", "AVATAR","ID", "NOMBRE", 
            "DIRECCIÓN","TELEFONO","DUI","NACIMIENTO",
            "TIPO EMPLEADO","PAGO DÍA"};
        DefaultTableModel tm=new DefaultTableModel(title,0);
        
        try {
            ar.addAll(ob.mostrar());
            Object[] vec=new Object[12];
            for(Empleado  v: ar){
                vec[0]=v.getUsuario();
                vec[1]=v.getCorreo();
                vec[2]=v.getContraseña();
                vec[3]=v.getAvatar();
                vec[4]=v.getIdEmpleado();
                vec[5]=v.getNombre();
                vec[6]=v.getDireccion();
                vec[7]=v.getTelefono();
                vec[8]=v.getDui();
                vec[9]=v.getFechaNacimiento();
                vec[10]=v.getTipoEmpleado();
                vec[11]=v.getPagoDia();
                tm.addRow(vec);
            }
        } catch (Exception e) {
            
        }
        return tm;
    }
    public void agregar(String usuario, String correo, String contraseña, String avatar,
            String nombre,String direccion, String telefono, String dui,
            String fechaNacimiento, String tipoEmpleado, String pagoDia){
        try {
            em=new Empleado(usuario, correo, contraseña, avatar, nombre, direccion,
                  telefono, dui, fechaNacimiento, tipoEmpleado, Double.parseDouble(pagoDia));
            res=ob.agregarEmpleado(em);
            
            if(res>0)
                JOptionPane.showMessageDialog(null, "Registro ingresado correctamente");
            else
                JOptionPane.showMessageDialog(null, "Registro no se pudo ingresar");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void modificar(int idEmpleado,String nombre,String direccion, String telefono, String dui,
            String fechaNacimiento, String tipoEmpleado, String pagoDia, String idUsuario){
       /*try {
            em=new Empleado(idEmpleado, nombre,direccion, telefono, dui, fechaNacimiento, 
                    tipoEmpleado, Double.parseDouble(pagoDia),idUsuario);
            res=ob.modificarEmpleado(em);
            if(res>0)
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            else
                JOptionPane.showMessageDialog(null, "Registro no se pudo modificar");
            
        } catch (Exception e) {
        }*/
    }
    
    public void eliminar(int idEmpleado){
       /* try {
             em=new Empleado(idEmpleado);
             res=ob.eliminarEmpleado(em);
            if(res>0)
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            else
                JOptionPane.showMessageDialog(null, "Registro no eliminado");
            
        } catch (Exception e) {
        }*/
    }
}
