package co.edu.UEF.asignaturasOptc.modelo;

import java.util.*;

/**
 * 
 */
public class Profesor extends Usuario {

    /**
     * Default constructor
     */
    public Profesor() {
    }

    /**
     * 
     */
    private String facultad;

    /**
     * 
     */
    private int fechaContrato;

    /**
     * 
     */
    private Horario horario;

    /**
     * @param fechaActual 
     * @return
     */
    public int calcularAntiguedad(int fechaActual) {
        // TODO implement here
        return 0;
    }

    /**
     * @param facultad 
     * @param fechaContrato 
     * @param horario
     */
    public void Profesor(String facultad, String fechaContrato, Horario horario) {
        // TODO implement here
    }

    /**
     * @param fechaActual 
     * @return
     */
    public abstract int calcularAntiguedad(int fechaActual);

}