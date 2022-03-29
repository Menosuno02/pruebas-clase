package git;

import java.util.Vector;

/**
 *
 * @author administrador
 */
public class Clase2 {

    private Vector<String> personas;
    private double numClase;

    public Clase2(Vector<String> personas) {
        this.personas = personas;
        this.numClase = (Math.random() + 1) * 100;
    }

    @Override
    public String toString() {
        return "Clase2{" + "personas=" + personas + '}';
    }

}
