import java.util.Scanner;

public class Example1SES1 {

    public static void main(String[] args) {

        // create the Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // 1- declare an array of size 4
        int[] numbers = new int[4];

        char char1;
        System.out.print("Enter the character: ");
        char1 = input.next().charAt(0);

        System.out.println(char1);


        // 2- fill it partially
        // numbers[0] = 5;
        // numbers[1] = 15;

        // 2- fill it by the user all the way to the end of the array
        for (int count = 0; count < numbers.length; count++) {
            System.out.print("Please enter a number: ");
            numbers[count] = input.nextInt();
        }

        // 3- output the array in full
        System.out.println("**** Array items ****");
        for (int count = 0; count < numbers.length; count++) {
            // if (count == 3)
            //     System.out.print(numbers[count]);
            // else
            //     System.out.print(numbers[count] + " - ");

            if (count < numbers.length - 1){
                System.out.print(numbers[count] + " - ");
            } else {
                System.out.print(numbers[count]);
            }
        }

    }

}
