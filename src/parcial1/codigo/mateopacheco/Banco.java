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
    
    
}
