/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.codigo.mateopacheco;

/**
 *
 * @author Estudiante
 */
public class Movimiento {
    private String Fecha;
    private double Saldo_Presedente;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(String Fecha, double Saldo_Presedente, double cantidad, Tipo tipo) {
        this.Fecha = Fecha;
        this.Saldo_Presedente = Saldo_Presedente;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public String getFecha() {
        return Fecha;
    }

    public double getSaldo_Presedente() {
        return Saldo_Presedente;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setSaldo_Presedente(double Saldo_Presedente) {
        this.Saldo_Presedente = Saldo_Presedente;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public double DoConsignacion (double Dinero_ingresado){
        System.out.println("HACIENDO Consignacion...");
        System.out.println("CONSIGNACION FINALIZADA.");
        double consignacion = Saldo_Presedente + Dinero_ingresado;
        System.out.println("Hizo una consignacion de: "+ Dinero_ingresado);
        System.out.println("Saldo actual es: ");
        return consignacion;
    }
    
    public double DoRetiro (double Dinero_retirado){
        System.out.println("HACIENDO RETIRO...");
        System.out.println("RETIRO FINALIZADO.");
        double retiro = Saldo_Presedente - Dinero_retirado;
        System.out.println("Hizo un retiro de:"+ Dinero_retirado);
        System.out.println("Saldo actual es: ");
        return retiro;
    }
}
