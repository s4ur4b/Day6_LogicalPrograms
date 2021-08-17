import java.util.Scanner;

public class ReverseNumber {
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);

            //Get user input value of Number to be checked
            System.out.println("Enter a Number");
            int number = scan.nextInt();
            //Passing the user input to ReverseNo function
            ReverseNo(number);
        }

//Created a function that reverses the input number
//User input value is passed to this function
    static void ReverseNo(int number) {
        int reverse = 0, remainder =0;
        while(number>0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("Reverse of the entered number is:"+reverse);
    }
}
