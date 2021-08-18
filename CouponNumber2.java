import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CouponNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get user input value of Number of Coupons to be generated
        System.out.println("Enter a Number");
        int number = scan.nextInt();
        //Passing the user input to randomCoupon function
        randomCoupon(number);
    }

    static void randomCoupon(int number) {
        //Created an arraylist as adding directly to array was not working
        ArrayList<Integer> table1 =new ArrayList<>();

        for (int i = 0; i < number; i++) {
            //Generated a random number within a range
            int couponNumber = (int) ThreadLocalRandom.current().nextInt(1000,9999);
            table1.add(couponNumber);
            System.out.println(table1.get(i));
        }
        //Check weather coupon number is unique
        int check =0;
        for (int j = 0; j < table1.size(); j++) {
            int firstNumber= table1.get(j);

            for (int k = j+1; k < table1.size(); k++) {
                int secondNumber = table1.get(k);

                if (firstNumber==secondNumber) {
                    check =1;
                }

            }

        }

        //Check condition
        if (check==1){
            System.out.println("The coupons are not unique");
        }
        else System.out.println("The coupons are unique");
    }//randomCoupon function ends here
}