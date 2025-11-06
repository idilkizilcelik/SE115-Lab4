import java.util.Scanner;
public class lab41{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("Please enter a number");
        a = sc.nextInt();
        for ( int i=0; i<=a ; i++){
            for( int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
