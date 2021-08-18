import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get user input value of Number of Coupons to be generated
        System.out.println("Enter a Number");
        int number = scan.nextInt();
        //Passing the user input to ReverseNo function
        randomCoupon(number);
    }

    static void randomCoupon(int number) {
        int[] table = new int[0];
        Random randNum = new Random();
        for (int i = 0; i < number; i++) {
            table = new int[number];
            table[i] = randNum.nextInt();
            System.out.println(table[i]);
        }
        int len = table.length;
        unique(table, len);
    }
     public static void unique(int[] table, int len) {
        int check =0;
         for (int j = 0; j < len; j++) {
                    int firstNumber=table[j];
             for (int k = j+1; k < len; k++) {
                 int secondNumber = table[k];
                 if (firstNumber==secondNumber) {
                     check =1;
                 }
             }
         }
        if (check==1){
            System.out.println("The coupons are not unique");
        }
        else System.out.println("The coupons are unique");
     }

}

