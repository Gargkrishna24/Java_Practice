import java.util.Scanner;

public class inputsofalldt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
         System.out.print("enter the int data type= ");
         int a= sc.nextInt();
         System.out.println(a);
         System.out.print("enter double data type= ");
         double b =sc.nextDouble();
         System.out.println(b);
         System.out.print("enter character= ");
         char ch = sc.next().charAt(0);
         System.out.println(ch);
         System.out.print("enter the string dt= ");
         String name = sc.next();  // string ka S capital mai aayega:
         System.out.println(name);
        System.out.println("enter the string in sentence= ");
        String sentence = sc.nextLine();   // nextLine mai "L" capital aayega :
        System.out.println(sentence);
        System.out.println("enter the float number =");
        float f= sc.nextFloat();
        System.out.println("enter the float number="+f);

        
        
    }
    
}
        
