public class Neon {
    public static void main(String[] args) {
        int n = 9;
        int sq = n * n;
        int sum = 0;
        for (; sq != 0; sq /= 10) {
            sum += sq % 10;
        }
        if (sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}
class Neon2 {
    public static void main(String[] args) {
        int n = 9;
        int sq = n * n;
        int sum = 0;
        for (; sq != 0; sq /= 10) {
            sum += sq % 10;
        }
        if (sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}
class Neon3 {
    public static void main(String[] args) {
        int n = 9;
        int sq = n * n;
        int sum = 0;
        for (; sq != 0; sq /= 10) {
            sum += sq % 10;
        }
        if (sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}