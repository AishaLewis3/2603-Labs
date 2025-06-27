import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends SimpleShape{
  
    protected int radius;
    
    public Circle(int r) {
       super();
       radius = r;
       xLoc += radius + 10; 
       calculateArea();
    }
    
    //#12.2
    @Override
    public void calculateArea() {
        area = (radius * radius) * Math.PI;
    }
    //#6 
     public String toString() {
        return "Circle " + super.toString();
    }
}
