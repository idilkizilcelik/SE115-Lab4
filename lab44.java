import java.util.Scanner;
public class lab44{
    public static int reverseNumber(int n) {
    int reverse = 0;
    while ( n!=0 ) {
        int a = n%10 ;
        reverse = reverse *10 +a;
        n= n/10;
    }
    return reverse;


    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = sc.nextInt();
        int reverse = reverseNumber(a);
        System.out.println("Reverse number is:  " + reverse);


    }
}
