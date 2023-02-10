package lab4p2_Equipo6;

public abstract class Pieza {
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected char nomb;
    protected boolean color;

    public Pieza() {
    }

    public Pieza(int x1, int y1, int x2, int y2, boolean color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pieza{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", color=" + color + '}';
    }
    
    public abstract boolean movimiento(Pieza p);
    
}
