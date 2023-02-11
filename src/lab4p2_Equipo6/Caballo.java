package lab4p2_Equipo6;

public class Caballo extends Pieza {

    public Caballo(boolean nomb) {
        super(nomb);
        if (color) {
            this.nomb = "N";
            this.x1 = 8;

        } else {
            this.nomb = "n";
            this.x1 = 1;
        }
    }

    public Caballo(int x1, int y1, int x2, int y2, boolean color, String nomb) {
        super(x1, y1, x2, y2, color, nomb);
    }

    public boolean movimiento(int x1, int y1, int x2, int y2, Object[][] Bayonetta) {
        if (color) {
            if (x1 + 2 == x2 && (y1 + 1 == y2 || y1 - 1 == y2) || x1 - 2 == x2 && (y1 + 1 == y2 || y1 - 1 == y2) || y1 + 2 == y2 && (x1 + 1 == x2 || x1 - 1 == x2) || y1 - 2 == y2 && (x1 + 1 == x2 || x1 - 1 == x2)) {
                if (Bayonetta[x2][y2] instanceof Pieza && ((Pieza) Bayonetta[x2][y2]).isColor() == false) {
                    return true;
                }
                return false;
            }
        }else{
            if (x1 + 2 == x2 && (y1 + 1 == y2 || y1 - 1 == y2) || x1 - 2 == x2 && (y1 + 1 == y2 || y1 - 1 == y2) || y1 + 2 == y2 && (x1 + 1 == x2 || x1 - 1 == x2) || y1 - 2 == y2 && (x1 + 1 == x2 || x1 - 1 == x2)) {
                if (Bayonetta[x2][y2] instanceof Pieza && ((Pieza) Bayonetta[x2][y2]).isColor() == true) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
