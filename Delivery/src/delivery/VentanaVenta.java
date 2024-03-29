/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Morella
 */
public class VentanaVenta extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVenta
     */
    public VentanaVenta() {
        initComponents();
        Refrescar();
        this.setVisible(true);
        jCantidadMilanesas.setEditable(false);
        jCantidadLomito.setEditable(false);
        jCantidadPizza.setEditable(false);
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCantidadMilanesas = new javax.swing.JTextField();
        jCantidadLomito = new javax.swing.JTextField();
        jCantidadPizza = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTotalMilanesa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTotalLomito = new javax.swing.JTextField();
        jTotalPizza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTotalFinal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jVerTodos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPendientes = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jCancelarPedido = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jOpciones = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox1.setText("Milanesa");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Lomito");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Pizza");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCantidadMilanesas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCantidadMilanesasKeyReleased(evt);
            }
        });

        jCantidadLomito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCantidadLomitoKeyReleased(evt);
            }
        });

        jCantidadPizza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCantidadPizzaKeyReleased(evt);
            }
        });

        jLabel1.setText("Totales Parciales");

        jLabel2.setText("Productos");

        jLabel3.setText("Cantidades");

        jLabel4.setText("TOTAL FINAL");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jVerTodos.setText("Ver todos");
        jVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerTodosActionPerformed(evt);
            }
        });

        jLabel5.setText("PEDIDOS");

        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPendientes.setText("Pendientes");
        jPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPendientesActionPerformed(evt);
            }
        });

        jLabel6.setText("AGREGAR UN NUEVO PEDIDO");

        jCancelarPedido.setText("Cancelar");
        jCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarPedidoActionPerformed(evt);
            }
        });

        jButton5.setText("Notificar Entrega");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("ID del pedido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCantidadMilanesas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCantidadLomito, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCantidadPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTotalMilanesa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jTotalLomito, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jTotalPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jVerTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jVerTodos)
                        .addGap(18, 18, 18)
                        .addComponent(jPendientes)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCancelarPedido)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(14, 14, 14)))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCantidadMilanesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCantidadLomito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCantidadPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalMilanesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTotalLomito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotalPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2)
                    .addComponent(jTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
     boolean milanesa = false;
        if (this.jCheckBox1.isSelected()){
          milanesa = true;
          jCantidadMilanesas.setEditable(true);
          
      }else{
            jCantidadMilanesas.setEditable(false);
            milanesa = false;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCantidadMilanesasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCantidadMilanesasKeyReleased
        int cantidad = Integer.parseInt(this.jCantidadMilanesas.getText());
        calcularTotalMilanesas(cantidad);
    }//GEN-LAST:event_jCantidadMilanesasKeyReleased

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(this.jCheckBox3.isSelected()){
            jCantidadPizza.setEditable(true);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
       if(this.jCheckBox2.isSelected()){
           jCantidadLomito.setEditable(true);
       }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCantidadLomitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCantidadLomitoKeyReleased
        int cantidad = Integer.parseInt(this.jCantidadLomito.getText());
        calcularTotalLomitos(cantidad);
    }//GEN-LAST:event_jCantidadLomitoKeyReleased

    private void jCantidadPizzaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCantidadPizzaKeyReleased
        int cantidad = Integer.parseInt(this.jCantidadPizza.getText());
        calcularTotalPizza(cantidad);
    }//GEN-LAST:event_jCantidadPizzaKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String pedido1 = "";
       String pedido2 = "";
       String pedido3 = "";
       String cantidad1 = "";
       String cantidad2 = "";
       String cantidad3 = "";
       if (this.jCheckBox1.isSelected()) {
           pedido1 = "milanesas";
           cantidad1=this.jCantidadMilanesas.getText();
       } 
       if(this.jCheckBox2.isSelected()) {
           pedido2= "lomitos";
           cantidad2=this.jCantidadLomito.getText();
       }
       if(this.jCheckBox3.isSelected()){
           pedido3 = "pizzas";
           cantidad3 = this.jCantidadPizza.getText();
       }
       String pedido = cantidad1+" "+pedido1+" "+cantidad2+" "+pedido2+" "+cantidad3+" "+pedido3;
       float total = Float.parseFloat(this.jTotalFinal.getText());
       String estado = "pendiente";
       Venta v = new Venta(pedido,total,estado);
       OperacionesBD.AgregarPedido(v);
       Refrescar();
       jCheckBox1.setEnabled(true);
       jCheckBox1.setSelected(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerTodosActionPerformed
        Refrescar();
    }//GEN-LAST:event_jVerTodosActionPerformed

    private void jPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPendientesActionPerformed
        RefrescarPendientes();
    }//GEN-LAST:event_jPendientesActionPerformed

    private void jCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarPedidoActionPerformed

        if(this.jOpciones.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Ingrese un codigo");
        }else{
            int id = Integer.parseInt(this.jOpciones.getText());
            OperacionesBD.Cancelar(id);
            Refrescar();
        }
        
    }//GEN-LAST:event_jCancelarPedidoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(this.jOpciones.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this,"Ingrese un codigo");
        }else{
            int id = Integer.parseInt(this.jOpciones.getText());
            OperacionesBD.NotificarEntrega(id);
            Refrescar();
        }
    }//GEN-LAST:event_jButton5ActionPerformed
 
    public void calcularTotalLomitos(int cantidad){
        float total =0;
        total = 200*cantidad;
        this.jTotalLomito.setText(String.valueOf(total));
        calcularTotalFinal();
    }
    
    public void calcularTotalPizza(int cantidad){
        float total = cantidad*250;
        this.jTotalPizza.setText(String.valueOf(total));
        calcularTotalFinal();
    }
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jCancelarPedido;
    private javax.swing.JTextField jCantidadLomito;
    private javax.swing.JTextField jCantidadMilanesas;
    private javax.swing.JTextField jCantidadPizza;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jOpciones;
    private javax.swing.JButton jPendientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTotalFinal;
    private javax.swing.JTextField jTotalLomito;
    private javax.swing.JTextField jTotalMilanesa;
    private javax.swing.JTextField jTotalPizza;
    private javax.swing.JButton jVerTodos;
    // End of variables declaration//GEN-END:variables


public void calcularTotalMilanesas(int cantidad){
    int total = 0;
    total = cantidad*150;
    this.jTotalMilanesa.setText(String.valueOf(total));
    calcularTotalFinal();
}

public void  calcularTotalFinal(){
 
float total1 = 0;
float total2=0;
float total3=0;

if(jTotalMilanesa.getText().isEmpty()) {
     total1=0;
}else{
     total1 = Float.parseFloat(this.jTotalMilanesa.getText());
}

if(jTotalLomito.getText().isEmpty()){
    total2=0;
}else {
   total2 = Float.parseFloat(this.jTotalLomito.getText()); 
}
if (jTotalPizza.getText().isEmpty()){
     total3 =0;
}else{
     total3 = Float.parseFloat(this.jTotalPizza.getText());
}

float totalf = total1+total2+total3;
this.jTotalFinal.setText(String.valueOf(totalf));
}

private void Refrescar(){
DefaultTableModel tabla = new DefaultTableModel();
tabla.addColumn("ID");
tabla.addColumn("Pedido");
tabla.addColumn("Total");
tabla.addColumn("Estado");
for (Venta v : OperacionesBD.Obtener()){
    Object fila [] = {
        v.getNumero(),
        v.getPedido(),
        v.getTotal(),
        v.getEstado(),
    };
    tabla.addRow(fila);
}
this.jTable1.setModel(tabla);
}
private void RefrescarPendientes(){
DefaultTableModel tabla = new DefaultTableModel();
tabla.addColumn("ID");
tabla.addColumn("Pedido");
tabla.addColumn("Total");
tabla.addColumn("Estado");
for (Venta v : OperacionesBD.Buscar()){
    Object fila [] = {
        v.getNumero(),
        v.getPedido(),
        v.getTotal(),
        v.getEstado(),
    };
    tabla.addRow(fila);
}
this.jTable1.setModel(tabla);
}
}

