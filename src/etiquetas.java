

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class etiquetas extends javax.swing.JFrame {
     
    public etiquetas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miEtiqueta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miEtiqueta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miEtiquetaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(miEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(miEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miEtiquetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miEtiquetaMouseClicked
        
        File miArchivo = new File("ejemplo.jpg");
        try {
            
            BufferedImage miImagen= ImageIO.read(miArchivo);
            ImageIcon miIcono=new ImageIcon(miImagen);
            miEtiqueta.setIcon(miIcono);
        } catch (IOException ex) {
            System.out.println("no entiendo aún por qué la embarraría!");
        }

    }//GEN-LAST:event_miEtiquetaMouseClicked

    public static void main(String args[]) {

     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new etiquetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel miEtiqueta;
    // End of variables declaration//GEN-END:variables
}
