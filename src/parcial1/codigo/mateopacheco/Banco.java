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
public class Banco {
    private String Codigo;
    private ArrayList<Cuenta> Cuentas;
    private ArrayList<Tipo> Tipos;
    
    public Banco (String a){
        this.Codigo = a;
        this.Cuentas = new ArrayList();
        this.Tipos = new ArrayList();
    };

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    public boolean addCuenta(int No_Cuenta, double Saldo_Cuenta, String Fecha_Creacion, String Nombre_Cliente){
       Cuenta Cuentas = new Cuenta(No_Cuenta, Saldo_Cuenta, Fecha_Creacion, Nombre_Cliente);
       if(this.Cuentas.add(Cuentas))
           return true;
       else 
           return false;
    
    }
    
    public ArrayList<Cuenta> listarCuentas(){
        return (ArrayList)this.Cuentas;
    }
    
    public ArrayList<Tipo> listartipos(){
      return this.Tipos;
    }
    
    public void DoConsignacion(Double Consigacion, String Fecha, double Saldo_Presedente, double cantidad, Tipo tipo){
        Movimiento mov = new Movimiento(Fecha, Saldo_Presedente, cantidad, tipo);
        mov.DoConsignacion(Consigacion);
    }
    
    public void DoRetiro(Double Retiro, String Fecha, double Saldo_Presedente, double cantidad, Tipo tipo){
        Movimiento mov = new Movimiento(Fecha, Saldo_Presedente, cantidad, tipo);
        mov.DoRetiro(Retiro);
    }
 
}
