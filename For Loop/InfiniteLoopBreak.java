import java.util.Scanner;

public class InfiniteLoopBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        for (;;) {
            System.out.print("Enter 0 to stop, any other number to continue: ");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
        }
        System.out.println("Loop Terminated.");
    }
}
class InfiniteLoopBreak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        for (;;) {
            System.out.print("Enter 0 to stop, any other number to continue: ");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
        }
        System.out.println("Loop Terminated.");
    }
}
class InfiniteLoopBreak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        for (;;) {
            System.out.print("Enter 0 to stop, any other number to continue: ");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
        }
        System.out.println("Loop Terminated.");
    }
}
