package lab4p2_Equipo6;

public class Dama extends Pieza{

    public Dama(boolean color) {
        
        super(color);
        if(color){
            this.nomb = "Q";
            this.x1 = 8;
            this.y1 = 4;
            
        }else{
            this.nomb = "q";
            this.x1 = 1;
            this.y1 = 4;
        }
    }

    public Dama(int x1, int y1, int x2, int y2, boolean color, String nomb) {
        super(x1, y1, x2, y2, color, nomb);
    }
    
    
    
    public boolean movimiento(int x1, int y1, int x2, int y2, Object[][] Bayonetta){
        return true;
    }
}
