//This is a Program to check weather anumber is a Prime number
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get user input value of Number to be checked
        System.out.println("Enter a Number");
        int number = scan.nextInt();
        //Passing the user input to PerfectNo function
        PrimeNo(number);
    }

//Created a function that checks for Prime number
//User input value is passed to this function
    static void PrimeNo(int number) {
        int check = 0;
        for (int i = 2; i < number; i++) {
            int prime = number % i;
            if (prime == 0) {
                check = 0;
                break;
            } else {
                check = 1;
                break;
            }
        }//for loop ends here
        //Condition to check prime
        if (check == 0) {
            System.out.println("Number is not prime");
        } else System.out.println("Number is prime");
    }
}
