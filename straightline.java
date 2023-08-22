/* Given three points (x1,y1),(x2,y2) and (x3,y3), write a program to check if all the three 
 points fall on one straight line */

import java.util.Scanner;

public class straightline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.print("enter the value of x1 = ");
        int x1 = sc.nextInt();
        System.out.print("enter the value of x2 = ");
        int x2 = sc.nextInt();
        System.out.print("enter the value of x3 = ");
        int x3 = sc.nextInt();
        System.out.print("enter the value of y1 = ");
        int y1 = sc.nextInt();
        System.out.print("enter the value of y2 = ");
        int y2 =sc.nextInt();
        System.out.print("enter the value of y3 = ");
        int y3 = sc.nextInt();
        int a = (y2 - y1)/(x2 - x1);
        int b = (y3 - y2)/(x3 - x2);
        if(a==b){
            System.out.println(" All three points falls on the one straight line ");
        }
        else{
            System.out.println("All three points are not falling on the one straight line ");
        }
    }
    
}
