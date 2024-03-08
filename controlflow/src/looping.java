public class looping {
    public static void main(String[] args) {

        // for loop
        int num = 5;
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " Java Sucks");
        }


        // for-each loop

        int[] numbers = { 3, 5, 6, 7, 3, 2, 5 };

        int sum = 2;

        for (int number : numbers) {
            System.out.println(number);

            /**
             * the new sum return * by the new number in the array
             * */ 
            sum *= number;

            System.out.println("sum: "+ sum);

        }


        char[] vow = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vow.length; ++i) {
            System.out.println(vow[i]);

         }





    }

}
