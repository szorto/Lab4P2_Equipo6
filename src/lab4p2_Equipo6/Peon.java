package lab4p2_Equipo6;

public class Peon extends Pieza {

    public Peon(boolean color) {
        super(color);
        if (color) {
            this.nomb = "P";
            this.x1 = 7;

        } else {
            this.nomb = "p";
            this.x1 = 2;
        }
    }

    public Peon(int x1, int y1, int x2, int y2, boolean color, String nomb) {
        super(x1, y1, x2, y2, color, nomb);
    }

    public boolean movimiento(int x1, int y1, int x2, int y2, Object[][] Bayonetta) {
        if (color) {
            if (x1 == 7) {
                if (y1 + 1 == y2 || y1 + 2 == y2) {
                    if (Bayonetta[x2][y2] instanceof Pieza) {
                        return false;
                    }
                    return true;
                }else if((x1 + 1) == x2 || (x1 - 1) == x2 && y1 + 1 == y2){
                    if(Bayonetta[x2][y2] instanceof Pieza && ((Pieza)Bayonetta[x2][y2]).isColor() == false){
                        return true;
                    }
                    return false;
                }
                return false;
            } else {
                if (y1 + 1 == y2) {
                    if (Bayonetta[x2][y2] instanceof Pieza) {
                        return false;
                    }
                    return true;
                }else if((x1 + 1) == x2 || (x1 - 1) == x2 && y1 + 1 == y2){
                    if(Bayonetta[x2][y2] instanceof Pieza && ((Pieza)Bayonetta[x2][y2]).isColor() == false){
                        return true;
                    }
                    return false;
                }
                
            }
        }else{
            if (x1 == 2) {
                if (y1 + 1 == y2 || y1 + 2 == y2) {
                    if (Bayonetta[x2][y2] instanceof Pieza) {
                        return false;
                    }
                    return true;
                }else if((x1 + 1) == x2 || (x1 - 1) == x2 && y1 + 1 == y2){
                    if(Bayonetta[x2][y2] instanceof Pieza && ((Pieza)Bayonetta[x2][y2]).isColor() == true){
                        return true;
                    }
                    return false;
                }
                return false;
            } else {
                if (y1 + 1 == y2) {
                    if (Bayonetta[x2][y2] instanceof Pieza) {
                        return false;
                    }
                    return true;
                }else if((x1 + 1) == x2 || (x1 - 1) == x2 && y1 + 1 == y2){
                    if(Bayonetta[x2][y2] instanceof Pieza && ((Pieza)Bayonetta[x2][y2]).isColor() == true){
                        return true;
                    }
                    return false;
                }
                
            }
        }

        return false;
    }
}
