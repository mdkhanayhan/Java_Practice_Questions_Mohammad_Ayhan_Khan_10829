import java.util.Scanner;

public class TringleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        if (a == b && b == c)
            System.out.println("Equilateral");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        if (a==b && b==c)
            System.out.println("Equilateral");
        else if (a==b || b==c || a==c)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        if (a==b && b==c)
            System.out.println("Equilateral");
        else if (a==b || b==c || a==c)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}
