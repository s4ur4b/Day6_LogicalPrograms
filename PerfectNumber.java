//This is a program to check wheather a number is a Perfect Number or not
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    //Get user input value of Number to be checked
        System.out.println("Enter a Number");
        int number = scan.nextInt();
    //Passing the user input to PerfectNo function
        PerfectNo(number);
    }
//Created a function that checks for Perfect number condition
//User input value is passed to this function
    static void PerfectNo(int number){
        //Initiating a variable 'sum' to find sum of factors of number
        int sum = 0;
        System.out.println("Factors of "+number+" are:");
        //loop for checking factors of number
        for(int i=1;i<number;i++){
            int remainder = number%i;
            if( remainder==0){
                System.out.print("  "+i+" ");
                sum = sum + i;
            }
        } //for loop ends here
        System.out.println("\nSum of Factors="+sum);

        //Condition to check Perfect Number
        if(sum==number){
                System.out.println("It is a Perfect Number");
            }
        else System.out.println("It is not a Perfect Number");

    }
}
