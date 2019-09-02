/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import DAO.DaoMaquinaria;
import Identidades.Maquinaria;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author romer
 */
public class TransaccionesMaquinaria {
    Maquinaria maq;
    int res=0;
    DaoMaquinaria ob=new DaoMaquinaria();
    public DefaultTableModel mostrar(){
        ArrayList<Maquinaria> ar=new ArrayList<Maquinaria>();
        String[] title={"ID", "NOMBRE", "TIPO MAQUINARIA", "MARCA", "PRECIO DIA", "EXISTENCIA"};
        DefaultTableModel tm=new DefaultTableModel(title,0);
        try {
            ar.addAll(ob.mostrar());
            Object[] vec=new Object[6];
            for(Maquinaria  v: ar){
                vec[0]=v.getIdMaquinaria();
                vec[1]=v.getNombre();
                vec[2]=v.getTipoMaquinaria();
                vec[3]=v.getMarca();
                vec[4]=v.getPrecioDia();
                vec[5]=v.getExistencia();
                tm.addRow(vec);
            }
        } catch (Exception e) {
            
        }
        return tm;
    }
    public void agregar(String nombre, String tipoMaquinaria, String marca, String precioDia, String existencia){
        try {
            maq=new Maquinaria(nombre, tipoMaquinaria, marca, Double.valueOf(precioDia), Integer.valueOf(existencia));
            res=ob.agregarMaquinaria(maq);
            if(res>0)
                JOptionPane.showMessageDialog(null, "Registro ingresado correctamente");
            else
                JOptionPane.showMessageDialog(null, "Registro no se pudo ingresar");
            
        } catch (Exception e) {
        }
    }
    
    public void modificar(int idMaquinaria,String nombre, String tipoMaquinaria, String marca, String precioDia, String existencia){
        try {
            maq=new Maquinaria(idMaquinaria, nombre, tipoMaquinaria, marca, Double.parseDouble(precioDia),Integer.valueOf(existencia));
            res=ob.modificarMaquinaria(maq);
            if(res>0)
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            else
                JOptionPane.showMessageDialog(null, "Registro no se pudo modificar");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "fAIL");
        }
    }
    
    public void eliminar(int idMaquinaria){
        try {
            maq=new Maquinaria(idMaquinaria);
            res=ob.eliminarMaquinaria(maq);
            if(res>0)
                JOptionPane.showMessageDialog(null, "Registro eliminado co éxito");
            else
                JOptionPane.showMessageDialog(null, "Registro no eliminado");
            
        } catch (Exception e) {
        }
    }
}

