import java.awt.Color;
public class ShapeRunner{
   public static void main(String[] args){
    ShapeScreen s = new ShapeScreen();
     
    //#3
    //create instances
    SimpleShape s1 = new SimpleShape();
    Rectangle s2 = new Rectangle(50, 100);
    
    //#7
    SimpleShape s3 = new Circle(50);
    
    //#8
    SimpleShape s4 = new Circle(30);
    SimpleShape s5 = new Rectangle(300, 100);
    //polymorphism - one class can morph into a next aka simpleshape being morphed into a rectangle
    
    //#5  
    /*SimpleShape s2 = new Rectangle(50, 100);
     * nothing changes
     */
    /* 
    //toString() for the instances and print
    System.out.println(s1.toString());
    System.out.println(s2.toString());
    
    //#9
    System.out.println(s3.toString());
    System.out.println(s4.toString());
    System.out.println(s5.toString());
    */
   
    //#10
    /*Answer: 
    s1: 
    s2: 
    s3: 
    s4: 
    s5:
    */
    
    //#11
    //a
    SimpleShape[] shapes = new SimpleShape[5];
    
    //b
    shapes[0] = s1;
    shapes[1] = s2;
    shapes[2] = s3;
    shapes[3] = s4;
    shapes[4] = s5;
    
    //c
    //Explanation:
    for(SimpleShape ss: shapes){
        //#13
        ss.calculateArea();
        System.out.println(ss.toString());
    }
    
    //#14
    /*Rectangle s6 = new SimpleShape();
     * It did not compile because...
     */
   }
}
