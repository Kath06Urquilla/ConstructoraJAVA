/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
/**
 *
 * @author jorge Alberto
 */
public class Validaciones {
    public void validarSoloLetras(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               Character c=e.getKeyChar();
               if(!Character.isLetter(c)){
                   e.consume();
               }
           }
       });
    }
     public void validarSoloLetrasEspacio(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               Character c=e.getKeyChar();
               if(!Character.isLetter(c) && c!=KeyEvent.VK_SPACE){
                   e.consume();
               }
           }
       });
    }
     
     public void validarSoloLetrasEspacioNumero(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               Character c=e.getKeyChar();
               if(!Character.isLetter(c) && c!=KeyEvent.VK_SPACE && !Character.isDigit(c)){
                   e.consume();
               }
           }
       });
    }
 
    public void validarSoloNumeros(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                Character c = e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
    }
    
    public void validarSoloNumerosGuiones(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                Character c = e.getKeyChar();
                if(!Character.isDigit(c) && c!='-'){
                    e.consume();
                }
            }
        });
    }
     
    public void validarSoloNumerosPunto(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                Character c = e.getKeyChar();
                if(!Character.isDigit(c) && c!='.'){
                    e.consume();
                }
                /*if(c=='.' && JTextField.getText().contains("."))
                {
                    e.consume();
                }*/
                
            }
        });
    }    
    public void validarNumeroLestrasArroba(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                Character c = e.getKeyChar();
                if(!Character.isDigit(c) && !Character.isLetter(c) && c!='@' && c!='-' && c!='.' && c!='_'){
                    e.consume();
                }
                /*if(c=='.' && JTextField.getText().contains("."))
                {
                    e.consume();
                }*/
                
            }
        });
    }
   
    public void validarSoloLetrasNumeros(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               Character c=e.getKeyChar();
               if(!Character.isLetter(c) && !Character.isDigit(c) && c!='_' ){
                   e.consume();
               }
           }
       });
    }
}
