package lab4p2_Equipo6;

public class Alfil extends Pieza {

    public Alfil(boolean color) {
        super(color);
        if (color) {
            this.nomb = "B";
            this.x1 = 8;

        } else {
            this.nomb = "b";
            this.x1 = 1;
        }
    }

    public Alfil(int x1, int y1, int x2, int y2, boolean color, String nomb) {
        super(x1, y1, x2, y2, color, nomb);
    }

    public boolean movimiento(int x1, int y1, int x2, int y2, Object[][] Bayonetta) {
        if (color) {
            for (int i = 1; i < 10; i++) {
                if (x1 + i == x2 && y1 + i == y2) {
                    if (Bayonetta[x2][y2] instanceof Pieza && ((Pieza) Bayonetta[x2][y2]).isColor() == false) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        } else {
            for (int i = 1; i < 10; i++) {
                if (x1 + i == x2 && y1 + i == y2) {
                    if (Bayonetta[x2][y2] instanceof Pieza && ((Pieza) Bayonetta[x2][y2]).isColor() == true) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }
        return true;
    }
}
