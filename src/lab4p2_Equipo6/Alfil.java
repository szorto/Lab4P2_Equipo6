package lab4p2_Equipo6;

public class Alfil extends Pieza{

    public Alfil() {
        super();
        if(color){
            this.nomb = 'B';
            this.x1 = 8;
            
        }else{
            this.nomb = 'b';
            this.x1 = 1;
        }
    }

    public Alfil(int x1, int y1, int x2, int y2, boolean color) {
        super(x1, y1, x2, y2, color);
    }
    
    
    
    public boolean movimiento(Pieza p){
        return true;
    }
}
