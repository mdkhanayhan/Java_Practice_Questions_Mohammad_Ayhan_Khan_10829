public class CountSetBits {
    public static void main(String[] args) {
        int n = 23;
        int count = 0;
        for (; n > 0; n >>= 1) {
            if ((n & 1) == 1) {
                count++;
            }
        }
        System.out.println("Set bits: " + count);
    }
}
class CountSetBits2 {
    public static void main(String[] args) {
        int n = 23;
        int count = 0;
        for (; n > 0; n >>= 1) {
            if ((n & 1) == 1) {
                count++;
            }
        }
        System.out.println("Set bits: " + count);
    }
}
class CountSetBits3 {
    public static void main(String[] args) {
        int n = 23;
        int count = 0;
        for (; n > 0; n >>= 1) {
            if ((n & 1) == 1) {
                count++;
            }
        }
        System.out.println("Set bits: " + count);
    }
}