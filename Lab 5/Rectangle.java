import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;

public class Rectangle extends SimpleShape{
    
    private int length;
    private int breadth;
    private int edgeRoundness;
    
    public Rectangle(int l, int b){
        super();
        length = l;
        breadth = b;
        edgeRoundness = 0;
        xLoc += length + 10;
        calculateArea();
    }
    
    //#12.1
    /*
     * In Java, the override keyword is used in a subclass to provide a specific implementation of a method that is already 
     * defined in it s superclass. By overriding a method, the subclass can alter or extend the behavior of the inherited method
     * to suit its specific needs.
     */
    @Override
    public void calculateArea() {
        area = length * breadth;
    }
    
    //#4  
    //method refinement
     public String toString() {
        return "Rectangle " + super.toString();
    }
}
