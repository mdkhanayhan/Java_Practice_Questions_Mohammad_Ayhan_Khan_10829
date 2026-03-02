public class Spy {
    public static void main(String[] args) {
        int n = 1124;
        int sum = 0, product = 1;
        int temp = n;
        for (; temp != 0; temp /= 10) {
            int d = temp % 10;
            sum += d;
            product *= d;
        }
        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}
class Spy2 {
    public static void main(String[] args) {
        int n = 1124;
        int sum = 0, product = 1;
        int temp = n;
        for (; temp != 0; temp /= 10) {
            int d = temp % 10;
            sum += d;
            product *= d;
        }
        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}
class Spy3 {
    public static void main(String[] args) {
        int n = 1124;
        int sum = 0, product = 1;
        int temp = n;
        for (; temp != 0; temp /= 10) {
            int d = temp % 10;
            sum += d;
            product *= d;
        }
        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}