/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Visual;

import Controlador.Empresa;
import Controlador.miModelo;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dam
 */
public class pnlConsulta extends javax.swing.JPanel {
    
    Empresa miEmpresa;
    miModelo modelo;

    /** Creates new form pnlConsulta */
    public pnlConsulta(Empresa miEmpresa) {
        initComponents();
        this.miEmpresa = miEmpresa;
        modelo = new miModelo();
        String []titulos = new String[] {"NOMBRE","LOGIN"};
        modelo.setColumnIdentifiers(titulos);
        tabla.setModel(modelo);
        cargarDatos();
    }
    
    private void cargarDatos(){
        boolean tengaselementos = true;
        int pos = 0;
        while(tengaselementos && pos < miEmpresa.numeroElementos()){
            if(miEmpresa.getUsuarios()[pos] != null){
                Vector v = new Vector();
                v.add(miEmpresa.getUsuarios()[pos].getNombre());
                v.add(miEmpresa.getUsuarios()[pos].getLogin());
                modelo.addRow(v); //al modelo añadele una fila con lo que tiene v
                //que son los datos de antes
                pos++;
            }else{
                tengaselementos = false;
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
