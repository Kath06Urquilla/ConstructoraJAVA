/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Identidades.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge Alberto
 */
public class Principal extends javax.swing.JFrame {
    
    Cliente mod;

    /**
     * Creates new form Principal
     */
    frmEmpleado frme = new frmEmpleado();
    frmMateriales frmmate = new frmMateriales();
    frmUsuario frmusu = new frmUsuario();
   // frmMaterailes frmmate = new frmMaterailes();
    public Principal() throws ClassNotFoundException, SQLException {
        initComponents();
        //IniciarPanel();        
        
    }
    
    public Principal(Cliente mod) throws ClassNotFoundException, SQLException{
        initComponents();
        
        this.mod = mod;
        
        if("Cliente".equals(mod.getRol())){
            llenado();
        }
    }
    
        void llenado(){
        
            try {
                this.getContentPane().setBackground(Color.black);
                this.setExtendedState(Principal.MAXIMIZED_BOTH);
                ifempleado.setContentPane(frme);
                ifmateriales.setContentPane(frmmate);
                ifusuarios.setContentPane(frmusu);                
                
            } catch (Exception e) {
            }
        }

    
    /*void IniciarPanel(){
        //Color MDI
    this.getContentPane().setBackground(Color.black);
    this.setExtendedState(Principal.MAXIMIZED_BOTH);
        ifempleado.setContentPane(frme);
        ifmateriales.setContentPane(frmmate);
      //  ifmateriales.setContentPane(frmmate);
    }*/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        ifempleado = new javax.swing.JInternalFrame();
        ifmateriales = new javax.swing.JInternalFrame();
        ifusuarios = new javax.swing.JInternalFrame();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        deleteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ifempleado.setClosable(true);
        ifempleado.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ifempleado.setIconifiable(true);
        ifempleado.setMaximizable(true);
        ifempleado.setVisible(false);

        javax.swing.GroupLayout ifempleadoLayout = new javax.swing.GroupLayout(ifempleado.getContentPane());
        ifempleado.getContentPane().setLayout(ifempleadoLayout);
        ifempleadoLayout.setHorizontalGroup(
            ifempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifempleadoLayout.setVerticalGroup(
            ifempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(ifempleado);
        ifempleado.setBounds(10, 10, 880, 650);

        ifmateriales.setClosable(true);
        ifmateriales.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ifmateriales.setIconifiable(true);
        ifmateriales.setMaximizable(true);
        ifmateriales.setVisible(false);

        javax.swing.GroupLayout ifmaterialesLayout = new javax.swing.GroupLayout(ifmateriales.getContentPane());
        ifmateriales.getContentPane().setLayout(ifmaterialesLayout);
        ifmaterialesLayout.setHorizontalGroup(
            ifmaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifmaterialesLayout.setVerticalGroup(
            ifmaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(ifmateriales);
        ifmateriales.setBounds(10, 10, 780, 550);

        ifusuarios.setClosable(true);
        ifusuarios.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ifusuarios.setIconifiable(true);
        ifusuarios.setMaximizable(true);
        ifusuarios.setVisible(false);

        javax.swing.GroupLayout ifusuariosLayout = new javax.swing.GroupLayout(ifusuarios.getContentPane());
        ifusuarios.getContentPane().setLayout(ifusuariosLayout);
        ifusuariosLayout.setHorizontalGroup(
            ifusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifusuariosLayout.setVerticalGroup(
            ifusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(ifusuarios);
        ifusuarios.setBounds(10, 10, 700, 500);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ca.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("File");
        fileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMenuMouseClicked(evt);
            }
        });

        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/em1.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Empleado");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maquinaria1.fw.png"))); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Maquinaria");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/materiales1.png"))); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Materiales");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jMenuItem1.setText("Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Reportes");

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        ifempleado.setVisible(true);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        ifmateriales.setVisible(true);
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void fileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ifusuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JInternalFrame ifempleado;
    private javax.swing.JInternalFrame ifmateriales;
    private javax.swing.JInternalFrame ifusuarios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
