/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Time;

/**
 *
 * @author BRYAN
 */
public class ManejadorRegistros {
    
    private int contador;
    private int errores;
    private int total;
    //private Time horaInicio;
    //private Time horaFinal;
    
    // tengo dudas de si esto va acá

    public ManejadorRegistros(int contador, int errores, int total) {
        this.contador = contador;
        this.errores = errores;
        this.total = total;
    }
    
    
    public ManejadorRegistros() {
        this.contador = 0;
        this.errores = 0;
        this.total = 0;
    }

    public int getContador() {
        return contador;
    }

    public int getErrores() {
        return errores;
    }

    public int getTotal() {
        return total;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    
}
