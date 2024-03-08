import java.util.Scanner;
public class dowhilelooping {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int num;

        do{
            System.out.print("Enter your value: ");
            num = s.nextInt();
        } while (num < 1 || num > 10);
        
        System.out.println(num + " is grater than 1 || less than 10");

        s.close();

    }
}
