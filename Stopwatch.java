import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        System.out.println("Press any key to start stopwatch");
        //To start the time count
        double start = System.currentTimeMillis();
        //Enter the process to count its execution time
        startStopwatch();
        double end = System.currentTimeMillis();
        System.out.println("Time: "+(end-start)+" ms");
    }
//This is a dummy function created just to record time
    static void startStopwatch(){
        Scanner scan = new Scanner(System.in);
        char x= scan.next().charAt(0);
        System.out.println("Press any key to stop stopwatch");
        char y= scan.next().charAt(0);
    }
}
