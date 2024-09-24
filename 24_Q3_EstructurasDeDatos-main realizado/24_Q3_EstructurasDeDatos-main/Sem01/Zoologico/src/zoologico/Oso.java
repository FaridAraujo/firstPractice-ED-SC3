package zoologico;

import java.time.LocalDate;

/**
 * Una para osos, definiendo su familia (polar, panda, pardo, etc). Así como
 * también su nombre y fecha de ingreso.
 */
public class Oso {

    //Atributos
    //public Oso hijo;
    public String familiaOso; // (polar, panda, pardo, etc)
    public String nombreOso;
    private LocalDate fechaIngreso;
    public boolean hibernando;

    public Oso() {
    }

    public void setHibernando(boolean hibernando) {
        //logica de definicion de valor en atributo hibernando
        this.hibernando = hibernando;
    }

    public String getFamiliaOso() {
        return familiaOso;
    }

    public void setFamiliaOso(String familiaOso) {
        this.familiaOso = familiaOso;
    }

    public String getNombreOso() {
        return nombreOso;
    }

    public void setNombreOso(String nombreOso) {
        this.nombreOso = nombreOso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean getHibernando() {
        //lee o devuelve el valor del atributo hibernndo
        return this.hibernando;
    }

    public void presentarOso() {
        System.out.println("Hola, soy un oso, mi nombre es: " + this.nombreOso + "y pertenezco a la familia de los:" + this.familiaOso
                + "\n¡Muchas gracias por venir a visitarme!");
    }

    public void indicadorHibernando() {
        //if(this.hibernando==true) Esto es una redundancia
        if (this.hibernando) {
            System.out.println("El oso esta hibernando, silencio.");
        } else {
            System.out.println("El oso esta despierto, mantengase alerta.");
        }
    }

}
