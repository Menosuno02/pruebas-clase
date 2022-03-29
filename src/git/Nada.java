package git;

/**
 *
 * @author administrador
 */
public class Nada {

    private int num;

    public Nada(int num) {
        this.num = num;
    }

    public String carga() {
        if (num % 2 == 0) {
            return "Si";
        } else {
            return "No";
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int x) {
        this.num = this.num + x;
    }

}
