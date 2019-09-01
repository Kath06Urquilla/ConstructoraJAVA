/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;
import DAO.DaoMaterial;
import Identidades.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorge Alberto
 */
public class TransaccionesMateriales {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    Material p;
    DaoMaterial obj=new DaoMaterial();
//*****************************************************************************************************************************
    public DefaultTableModel datos(){
         ArrayList<Material> ar=new ArrayList<Material>();
         String[] title={"Código","Nombre del Material","Precio","Existentes"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row=new Object[4];
         try {
             ar.addAll(obj.mostrar());
             for(Material v:ar){
                row[0]=v.getIdMteriaPrima();
                row[1]=v.getNombre();
                row[2]=v.getPrecioUnidad();
                row[3]=v.getExistencia();
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
//*********************************************************************************************************************************
    public void agregar(String nombre, String precioUnidad, int existencia){
        
        try {
            p=new Material(nombre,Double.valueOf(precioUnidad),existencia);
            int res = obj.agregar(p);
            if(res>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
//*********************************************************************************************************************************
    public void modificar(String idMateriaPrima,String nombre,String precioUnidad,String existencia){
         p=new Material(Integer.valueOf(idMateriaPrima),nombre,Double.valueOf(precioUnidad),Integer.valueOf(existencia));
         try {
            if(obj.modificar(p)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
//*********************************************************************************************************************************
    public void eliminar(int idMateriaPrima){
        p=new Material(idMateriaPrima);
        try {
            if(obj.eliminar(p)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
                    

        }
    }
}