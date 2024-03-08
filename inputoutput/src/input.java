import java.util.Scanner;

public class input {
   public static void main(String[] args) {

       Scanner inputScanner = new Scanner(System.in);

        // integer
       System.out.println("Enter your number: ");
       int number = inputScanner.nextInt();
       System.out.println("You entered " + number);



       //    string
       System.out.println("Enter your name: ");
       String name = inputScanner.next();
       System.out.println("Your name is " + name);



       //    Double
       System.out.println("Enter Your Double number: ");
       double nvuDB = inputScanner.nextDouble();
       System.out.println("Your double number: " + nvuDB);

       //  float
       System.out.println("Enter Your float number: ");
       float nvFlt = inputScanner.nextFloat();
       System.out.println("Your float number: " + nvFlt);


       inputScanner.close();
    
   } 
}
