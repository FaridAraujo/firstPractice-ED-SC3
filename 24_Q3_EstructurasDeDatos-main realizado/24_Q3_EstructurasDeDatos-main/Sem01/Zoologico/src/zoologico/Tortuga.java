/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.time.LocalDate;

/**
 *
 * @author Farid
 */

/**
Una para tortugas, definiendo en sus atributos si son marinas o terrestres. 
Así como también su nombre y su fecha de ingreso.
 */
public class Tortuga {
    
    private String tipoTortuga; // En este caso se debe definir si es marina o terrestre
    private String nombreTortuga;
    private LocalDate fechaIngreso;
    
    public Tortuga(String tipoTortuga, String nombreTortuga, LocalDate fechaIngreso) {
        this.tipoTortuga = tipoTortuga;
        this.nombreTortuga = nombreTortuga;
        this.fechaIngreso = fechaIngreso;
    }
    
    public String getTipoTortuga() {
        return tipoTortuga;
    }

    public void setTipoTortuga(String tipoTortuga) {
        this.tipoTortuga = tipoTortuga;
    }

    public String getNombreTortuga() {
        return nombreTortuga;
    }

    public void setNombreTortuga(String nombreTortuga) {
        this.nombreTortuga = nombreTortuga;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public void estadoTortuga() {
        if ("Marina".equalsIgnoreCase(tipoTortuga)) {
            System.out.println("La tortuga" + nombreTortuga + " en este momento se encuentra nadando");
        } else {
            System.out.println("La tortuga" + nombreTortuga + " en este momento se encuentra en tierra");
        }
        
    }
}
