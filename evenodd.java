// TAKE POSTIVE INTEGER INPUT AND TELL IF IT IS EVEN OR ODD

import java.util.Scanner;

public class evenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        int n =sc.nextInt();
        System.out.println("number given by user = "+n);
        if(n%2==0){
            System.out.println("the number we entered is 'EVEN' ");

        }
        else{
            System.out.println("the number we entered is 'ODD' ");

        }

    }
}