import java.util.Scanner;
public class threedigit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number >= 100 && number <= 999) {
                System.out.println(number + " is a three-digit number.");
            } else {
                System.out.println(number + " is not a three-digit number.");
            }
        }
        public static void main2(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number >= 100 && number <= 999) System.out.println(number + " is a three-digit number.");
            else System.out.println(number + " is not a three-digit number.");
            
        }
        public static void main3(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number >= 100 && number <= 999) System.out.println(number + " is a three-digit number."); 
            else System.out.println(number + " is not a three-digit number.");
        }
}