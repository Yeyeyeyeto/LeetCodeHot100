package Easy;

/**
 * @Auther Eternal
 * @Date 2021/9/17
 * 回文数
 */
public class IsPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int y = 0;
        int i = x;
        while (i != 0) {
            y = y * 10 + i % 10;
            i /= 10;
        }

        if (x == y) return true;

        return false;
    }
}
