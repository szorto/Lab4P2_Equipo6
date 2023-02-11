package lab4p2_Equipo6;

public class Caballo extends Pieza{

    public Caballo(boolean nomb) {
        super(nomb);
        if(color){
            this.nomb = "N";
            this.x1 = 8;
            
        }else{
            this.nomb = "n";
            this.x1 = 1;
        }
    }

    public Caballo(int x1, int y1, int x2, int y2, boolean color, String nomb) {
        super(x1, y1, x2, y2, color, nomb);
    }
    
    
    
    
    public boolean movimiento(Pieza p, Object[][] Bayonetta){
        return true;
    }
}
