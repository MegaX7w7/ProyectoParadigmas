
import java.util.*;

/**
 * 
 */
public class Estudiante extends Usuario {

    /**
     * Default constructor
     */
    public Estudiante() {
    }

    /**
     * 
     */
    private void fechaInscripcion;

    /**
     * 
     */
    private Carrera[] carreras;

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
     * @param fechaInscripcion 
     * @param carreas
     */
    public void Estudiante(int fechaInscripcion, Carrera[] carreas) {
        // TODO implement here
    }

    /**
     * @param fechaActual 
     * @return
     */
    public abstract int calcularAntiguedad(int fechaActual);

}