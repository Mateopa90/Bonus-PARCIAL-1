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
public class Parcial1CodigoMATEOPACHECO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("****BIENVENIDO***");
        Banco B1 = new Banco("N123");
        
        //Creacion de Cuentas
        B1.addCuenta(123456, 10000, "26_09_2017", "Ernesto");
        B1.addCuenta(654321, 5000, "26_09_2017", "Veronica");
        
        //Cuenta 1
        B1.DoConsignacion(123409.223, "26_09_2017", 10000, 23, new Tipo("23"));
        B1.DoRetiro(123.356, "26_09_2017", 10000, 23, new Tipo("23"));
        
        //Cuenta 2
        B1.DoConsignacion(21423536.234, "26_09_2017", 5000, 55, new Tipo("345"));
        B1.DoRetiro(23.234, "26_09_2017", 5000, 55, new Tipo("345"));
        
        //Mostrar Lista
        B1.listarCuentas();
    }
    
}
