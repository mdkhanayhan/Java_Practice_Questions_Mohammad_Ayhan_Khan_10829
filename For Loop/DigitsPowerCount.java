public class DigitsPowerCount {
    public static void main(String[] args) {
        int n = 123;
        int temp = n;
        int count = 0;
        for (int t = n; t != 0; t /= 10)
            count++;
        int sum = 0;
        for (; temp != 0; temp /= 10) {
            int d = temp % 10;
            int p = 1;
            for (int j = 1; j <= count; j++)
                p *= d;
            sum += p;
        }
        System.out.println("Result: " + sum);
    }
}
class DigitsPowerCount2 {
    public static void main(String[] args) {
        int n = 123;
        int temp = n;
        int count = 0;
        for (int t = n; t != 0; t /= 10)
            count++;
        int sum = 0;
        for (; temp != 0; temp /= 10) {
            int d = temp % 10;
            int p = 1;
            for (int j = 1; j <= count; j++)
                p *= d;
            sum += p;
        }
        System.out.println("Result: " + sum);
    }
}
class DigitsPowerCount3 {
    public static void main(String[] args) {
        int n = 123;
        int temp = n;
        int count = 0;
        for (int t = n; t != 0; t /= 10)
            count++;
        int sum = 0;
        for (; temp != 0; temp /= 10) {
            int d = temp % 10;
            int p = 1;
            for (int j = 1; j <= count; j++)
                p *= d;
            sum += p;
        }
        System.out.println("Result: " + sum);
    }
}
