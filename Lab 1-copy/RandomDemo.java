import java.util.Random;
    public class RandomDemo{
        public static void main(String[] args){
            Random r = new Random();
            
            int someRandomInt = r.nextInt(10);
            
            System.out.println(someRandomInt);
        }
    }