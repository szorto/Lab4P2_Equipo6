package lab4p2_Equipo6;

public class Rey extends Pieza{

    public Rey() {
        super();
        if(color){
            this.nomb = 'K';
            this.x1 = 8;
            this.y1 = 5;
            
        }else{
            this.nomb = 'k';
            this.x1 = 1;
            this.y1 = 5;
        }
    }

    public Rey(int x1, int y1, int x2, int y2, boolean color) {
        super(x1, y1, x2, y2, color);
    }
    
    
    
    
    
    public boolean movimiento(Pieza p){
        return true;
    }
}
