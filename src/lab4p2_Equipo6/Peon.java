package lab4p2_Equipo6;

public class Peon extends Pieza{

    public Peon() {
        super();
        if(color){
            this.nomb = 'P';
            this.x1 = 7;
            
        }else{
            this.nomb = 'P';
            this.x1 = 2;
        }
    }

    public Peon(int x1, int y1, int x2, int y2, boolean color) {
        super(x1, y1, x2, y2, color);
    }
    
    
    
    
    public boolean movimiento(Pieza p){
        return true;
    }
}
