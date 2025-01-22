import java.util.Scanner;
import java.util.Random;
public class Lab1PartThree{
    public static void exercise1(){ //method 1
        //Area of a circle = pi * r^2
        Scanner keyboard = new Scanner(System.in);
        double radius = keyboard.nextDouble(); //to specify that the value is a double
        double area = radius * radius * java.lang.Math.PI; //pi library
        System.out.println("A circle with radius" + radius + "has an area of" + String.format("%.02f", area) + " units"); //n decimal places of a variable = string.format("%.0nf, variable)
    }
    
    public static void exercise2(){//method 2
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = keyboard.nextInt();
        System.out.println("Even numbers from" + n + " : ");
        int count = 1;
        while(count <= n){
            if(count % 2 == 0){
                System.out.print(count + " ");
            }
            count++;
        }
    }
    
     public static void exercise3(){//method 3
        Random r = new Random();
        int num1 = r.nextInt(999); //r.nextInt(999) - chooses a random number from 1-999
        int num2 = r.nextInt(999);
        int answer = num1 * num2;
        System.out.println("What is the product of " + num1 + "and" + num2 + " ?");
        System.out.println("The answer is " + answer);
    }
    
    public static void exercise4(){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("hi");
    String response = keyboard.nextLine();
    String [] triggerWords = {"hey", "howdy-doo", "oye"};//array of strings
    java.util.Random r = new java.util.Random();
    }
    //array of int: int [] num = new int[100];
}