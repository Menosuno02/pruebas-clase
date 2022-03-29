package git;

import java.util.Vector;

/**
 *
 * @author administrador
 */
public class Clase2 {

    private Vector<String> personas;

    public Clase2(Vector<String> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Clase2{" + "personas=" + personas + '}';
    }

}
