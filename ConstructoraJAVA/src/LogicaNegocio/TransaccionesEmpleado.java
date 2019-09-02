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
        String[] title={"ID","USUARIO", "CORREO","PASSWORD", "ID", "NOMBRE", 
            "DIRECCIÓN","TELEFONO","DUI","NACIMIENTO",
            "TIPO EMPLEADO","PAGO DÍA"};
        DefaultTableModel tm=new DefaultTableModel(title,0);
        
        try {
            ar.addAll(ob.mostrar());
            Object[] vec=new Object[12];
            for(Empleado  v: ar){
                vec[0]=v.getIdUsuario();
                vec[1]=v.getUsuario();
                vec[2]=v.getCorreo();
                vec[3]=v.getContraseña();
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
    public void agregar(String usuario, String correo, String contraseña, String tipoEmpleado1, 
            String nombre,String direccion, String telefono, String dui,
            String fechaNacimiento, String tipoEmpleado, String pagoDia){
        try {
            em=new Empleado(usuario, correo, contraseña, tipoEmpleado1, nombre, direccion,
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
    
    public void modificar(String usuario, String correo, String contraseña, String tipoEmpleado1, 
             int idUsuario,String nombre,String direccion, String telefono, String dui,
            String fechaNacimiento, String tipoEmpleado, String pagoDia, int idEmpleado){
       try {
            em=new Empleado(idUsuario, usuario, correo, contraseña, tipoEmpleado1, idEmpleado, nombre, direccion, telefono, dui, fechaNacimiento, tipoEmpleado, res, res);
            res=ob.modificarEmpleado(em);
            if(res>0)
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            else
                JOptionPane.showMessageDialog(null, "Registro no se pudo modificar");
            
            
        } catch (Exception e) {
        }
    }
    
    public void eliminar(int idUsuario,int idEmpleado){
        try {
            em=new Empleado(idUsuario);
             res=ob.eliminarEmpleado(em);
             em=new Empleado(idEmpleado);
             res=ob.eliminarEmpleado(em);
             
            if(res>0)
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            else
                JOptionPane.showMessageDialog(null, "Registro no eliminado");
            
        } catch (Exception e) {
        }
    }
}
