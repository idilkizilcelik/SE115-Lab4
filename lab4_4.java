import java.util.Scanner;
public class lab4_4 {
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return reversed;
    }
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to reverse it: ");
        int number = sc.nextInt();
        int reversed = reverseNumber(number);
        System.out.println("reversed number is: " + reversed);
    }

}
