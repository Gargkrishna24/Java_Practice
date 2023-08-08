import java.util.Scanner;

public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        if((n%5==0)&&(n%3==0)) System.out.println("enterd number is divisible by both number 5 and 3");
        else System.out.println("entered number is not divisible by 5 and 3");
    } 
    
}
