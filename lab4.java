import java.util.Scanner;
public class lab4 {
    public static int factorialNumber(int n){
        int factorialResult= 1;
        for (int i = 1 ; i <=n ; i++ ){
            factorialResult = factorialResult*i;
        }
        return factorialResult;
    }
    public static void main (String [] args){
        System.out.println("Please enter a number ");
        Scanner sc= new Scanner(System.in);

    }
}