public class Palindrome {
    public static void main(String[] args) {
        int num = 121, reverse = 0, temp = num;

        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (num == reverse)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
    }
}
