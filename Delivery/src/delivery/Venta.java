/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery;


public class Venta {
   private String pedido;
   private float total;
   private String estado;
   private int numero;

    public Venta(String pedido, float total, String estado) {
        this.pedido = pedido;
        this.total = total;
        this.estado = estado;
    }

    public Venta(String pedido, float total, String estado, int numero) {
        this.pedido = pedido;
        this.total = total;
        this.estado = estado;
        this.numero = numero;
    }
   
    
   
   public Venta(){
    
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}
