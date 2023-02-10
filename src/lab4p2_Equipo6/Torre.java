package lab4p2_Equipo6;

/**
 *
 * @author szorto
 */
public class Torre extends Pieza{

    public Torre() {
        super();
        if(color){
            this.nomb = 'R';
            this.x1 = 8;
            
        }else{
            this.nomb = 'r';
            this.x1 = 1;
        }
    }

    public Torre(int x1, int y1, int x2, int y2, boolean color) {
        super(x1, y1, x2, y2, color);
    }
    
    
    
    public boolean movimiento(Pieza p){
        return true;
            
        
    }
}
