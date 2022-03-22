package git;

/**
 *
 * @author administrador
 */
public class GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 3;
        String nombre = "Alejandro";
        System.out.println("Prueba GIT");
        System.out.println(nombre + ", num de alumno: " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
