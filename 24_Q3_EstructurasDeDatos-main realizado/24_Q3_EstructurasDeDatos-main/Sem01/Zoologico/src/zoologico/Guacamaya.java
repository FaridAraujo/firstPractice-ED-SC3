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
 * Una para las guacamayas, definiendo su color principal (rojo, azul, amarilla,
 * etc). Además, recuerde que las guacamayas conservan su pareja toda su vida,
 * por lo que debe agregar un atributo que defina si tienen pareja o no. Así
 * como también su nombre y fecha de ingreso.
 */
public class Guacamaya {

    private String colorGuacamaya;
    private String nombreGuacamaya;
    private boolean pareja;
    private LocalDate fechaIngreso;

    public Guacamaya(String colorGuacamaya, String nombreGuacamaya, boolean pareja, LocalDate fechaIngreso) {
        this.colorGuacamaya = colorGuacamaya;
        this.nombreGuacamaya = nombreGuacamaya;
        this.pareja = pareja;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the colorGuacamaya
     */
    public String getColorGuacamaya() {
        return colorGuacamaya;
    }

    /**
     * @param colorGuacamaya the colorGuacamaya to set
     */
    public void setColorGuacamaya(String colorGuacamaya) {
        this.colorGuacamaya = colorGuacamaya;
    }

    /**
     * @return the nombreGuacamaya
     */
    public String getNombreGuacamaya() {
        return nombreGuacamaya;
    }

    /**
     * @param nombreGuacamaya the nombreGuacamaya to set
     */
    public void setNombreGuacamaya(String nombreGuacamaya) {
        this.nombreGuacamaya = nombreGuacamaya;
    }

    /**
     * @return the pareja
     */
    public boolean isPareja() {
        return pareja;
    }

    /**
     * @param pareja the pareja to set
     */
    public void setPareja(boolean pareja) {
        this.pareja = pareja;
    }

    /**
     * @return the fechaIngreso
     */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public void actividadGuacamaya() {
        System.out.println("La guacamaya " + nombreGuacamaya + " está reluciendo su hermoso color " + colorGuacamaya);
    }
}
