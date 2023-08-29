import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of a = ");
        int a = sc.nextInt();
    
    if(a==0) System.out.println("Entered number is zero");
    else if(a>0) System.out.println("Entered number is positive ");
    else System.out.println("Entered number is negative ");
    
}

}
