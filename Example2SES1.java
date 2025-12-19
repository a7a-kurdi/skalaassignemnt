import java.util.Scanner;

public class Example2SES1 {

    public static void main(String[] args) {
        // pass by value and pass by reference

        // 1- pass by value
        int number1 = 1, number2 = 2;
        addNums(number1, number2);
        System.out.println("Addition result from main is: " + (number1 + number2));

        // 2- pass by reference
        String[] majors = { "CE", "SE", "CS", "CSCS" };
        System.out.println("**** Majors list before updating ****");
        displayArray(majors);
        changeMajors(majors);
        System.out.println("**** Majors list after updating ****");
        displayArray(majors);

    } // end of main

    public static void changeMajors(String[] majorsArray) {
        Scanner input = new Scanner(System.in);

        // manipulate the values
        for (int count = 0; count < majorsArray.length; count++) {
            System.out.print("Please enter the full term of the major: ");
            majorsArray[count] = input.nextLine();
        }

    } // end of changeMajors

    public static void addNums(int num1, int num2) {
        num1 = 4;
        num2 = 10;
        System.out.println("Addition result from addNums is: " + (num1 + num2));
    } // end of addNums

    public static void displayArray(String[] majorsUKH) {
        for (int count = 0; count < majorsUKH.length; count++) {
            System.out.print(majorsUKH[count]+" ");
            
        }

        System.out.println();

    }

}// end of class
