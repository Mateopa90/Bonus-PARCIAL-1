/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.codigo.mateopacheco;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int No_Cuenta;
    private double Saldo_Cuenta;
    private String Fecha_Creacion;
    private String Nombre_Cliente;
    private Movimiento movimiento;

    public Cuenta(int No_Cuenta, double Saldo_Cuenta, String Fecha_Creacion, String Nombre_Cliente) {
        this.No_Cuenta = No_Cuenta;
        this.Saldo_Cuenta = Saldo_Cuenta;
        this.Fecha_Creacion = Fecha_Creacion;
        this.Nombre_Cliente = Nombre_Cliente;
        this.movimiento = new Movimiento(null, 0.0, 0.0, null);
    }

    public int getNo_Cuenta() {
        return No_Cuenta;
    }

    public double getSaldo_Cuenta() {
        return Saldo_Cuenta;
    }

    public String getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }
  
    
}
