import java.util.Scanner; //needed library to input via the keyboard
public class Lab1PartTwo{
    public static void main(String [] args){
        
        //NOTE: classes are better with capital letters
        
        //#1
        System.out.println("My name is Englebert.");
        
        //#2
        String name = "My name is Englebert Humperdinck"; //declaring string
        /* OR of course: 
         * string name;
         * name = "Josh"
         */
        System.out.println(name);
        
        //#3
        String afname = "Aisha ";
        String alname = "Lewis";
        System.out.println(afname + alname);
        
        //#4
        //see library
        Scanner keyboard = new Scanner(System.in);
        // Input a string
        System.out.println("Enter your name: ");
        String entered_name = keyboard.nextLine();
        System.out.println(entered_name);
        
        //#5 
        System.out.println("Hi, what's your name?");
        String convo_name = keyboard.nextLine();
        System.out.println("Nice to meet you " + convo_name + "!");
        
        //#6
        System.out.println("Hi, what's your name?");
        String sentence_name = keyboard.nextLine();
        String response = sentence_name.substring(11, sentence_name.length());
        System.out.println("Nice to meet you " + response + "!");
        
        /*To do a substring:
         * regular input(new variable + keyboard.nextline) : String sentence_name = keyboard.nextLine();
         * new variable = substring from old : String response = sentence_name.substring(11, sentence_name.length());
         * [note that the first value is where the string starts after and then we simply call the length of the sentence]
         * print new variable
         */

        //gotta close input
        keyboard.close();
        
        //to clear previous compiling
        //CAUSING AN ERROR!!!
        //System.out.print('\u000C');
    }
}