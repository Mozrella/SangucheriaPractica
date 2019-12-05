/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Morella
 */
public class OperacionesBD {
    
    public static void AgregarPedido(Venta v){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/tablas","root","");
            Statement s = c.createStatement();
            String comando = "INSERT INTO venta(pedido,total,estado)VALUES('"+v.getPedido()+"',"+v.getTotal()+",'"+v.getEstado()+"')";
            boolean r = s.execute(comando);
            System.out.print("Venta Agregada");
        }catch(Exception e){
            
        }
    }
    
    public static ArrayList<Venta> Obtener (){
        ArrayList <Venta> p = new ArrayList <>();
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/tablas","root","");
            Statement s = c.createStatement();
            String comando = "SELECT * FROM venta";
            ResultSet r = s.executeQuery(comando);
            while (r.next()){
                int id = r.getInt("id");
                String pedido = r.getString("pedido");
                float total = r.getFloat("total");
                String estado = r.getString("estado");
                Venta per = new Venta(pedido,total,estado,id);
                p.add(per);
            }
            
        }catch(Exception e){
            
        }
        return (p);
    
        
 }
    public static ArrayList<Venta> Buscar(){
        String estadoActual = "pendiente";
        ArrayList<Venta> v = new ArrayList<>();
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/tablas","root","");
            Statement s = c.createStatement(); 
            String comando = String.format("SELECT * FROM venta WHERE estado = '%s'",estadoActual);
            ResultSet r = s.executeQuery(comando);
           while(r.next()){
                int id = r.getInt("id");
                String pedido = r.getString("pedido");
                float total = r.getFloat("total");
                String estado = r.getString("estado");
                Venta per = new Venta(pedido,total,estado,id);
                v.add(per);
                System.out.println(per);
           }

 
             
        }catch(Exception e){
            return null;
        }
        return (v);
   
}
    
    public static void Cancelar(int id){
        String cadena = "cancelado";
        try{ 
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/tablas","root","");
            Statement s = c.createStatement();
            String sql = String.format("UPDATE venta SET estado='%s' WHERE id=%d",cadena,id);
            boolean r = s.execute(sql);
        }catch(Exception e){
            
        }
    }
    
        public static void NotificarEntrega(int id){
        String cadena = "Entregado";
        try{ 
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/tablas","root","");
            Statement s = c.createStatement();
            String sql = String.format("UPDATE venta SET estado='%s' WHERE id=%d",cadena,id);
            boolean r = s.execute(sql);
        }catch(Exception e){
            
        }
    }
    
}
