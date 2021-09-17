package Easy;

/**
 * @Auther Eternal
 * @Date 2021/9/17
 * 整数反转
 */
public class Reverse {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
            System.out.println("n:" + n);
            System.out.println("x:" + x);
        }
        return (int)n==n ? (int)n : 0;
    }
}
