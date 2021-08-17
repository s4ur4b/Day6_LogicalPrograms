//This is a program to print Fabonacci Series
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        //Getting user input for the value of N
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number uptill which you want a Fabonacci Series");
        int n = scan.nextInt();
        //Pass the user value to Fibonacci function
        Fibonacci(n);
    }
//Created a funtion to print Fabonacci Series
//The main funcion takes a number from the user and sends it to Fabonacci function
    static void Fibonacci(int n) {
        int sum = 0, i = 0, j = 1;
        int count = 0;
        while (count < n) {
            sum = i + j;
            i = j;
            j = sum;
            //Print the Series generated
            System.out.print(sum + " ");
            count++;
        }
    }
}