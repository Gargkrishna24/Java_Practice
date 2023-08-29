import java.util.Scanner;

public class divisbleby5and11 {
    public static void main(String[] args) {
        System.out.print("Enter the valu of a = ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a%5==0&&a%11==0) System.out.println("Entered number is divisble by 5 and 11 ");
        else System.out.println("Entered number is not divisble by both number ");
    }
    
}
