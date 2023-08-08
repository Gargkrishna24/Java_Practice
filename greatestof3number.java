// wap to find greatest of 3 using nested if else condition.......

import java.util.Scanner;

public class greatestof3number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        System.out.print("enter the 1st number= ");
        int a =sc.nextInt();
        System.out.println("enter the 2nd number= ");
        int b =sc.nextInt();
        System.out.println("enter the 3rd number= ");
        int c =sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is largest ");
            }
            else{
                System.out.println(c+" is largest ");
            }
        }
        else{
            if(b>c){
                System.out.println(b+ " is largest ");
            }
            else{
                System.out.println(c+" is largest ");
            }
        }
        
            
        
        

    }
    
}

            

