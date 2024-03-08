import java.util.Scanner;

public class switchflow {
    public static void main(String[] args) {

        System.out.print("Enter your size: ");

        // int num = 44;
        String size;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        switch (num) {
            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;

        }
        
        System.out.println("your number is "+ num +" Size "+ size);
        input.close();


        
    }
}
