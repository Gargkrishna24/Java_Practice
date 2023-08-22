// Given a points(x,y), write a program to find out if it lies on the x axis 
// y axis or at the origin , viz(0,0)....
import java.util.Scanner;

public class XYaxis {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println(sc);
         System.out.println(" enter the point 'x' = ");
         int x = sc.nextInt();
         System.out.println(" enter the point 'y' = ");
         int  y = sc.nextInt();
         if(x==0&&y==0){
            System.out.println("the points exists  on the orgins  ");
         }
         else if(x==0){
            System.out.println("the points exist on the y axis ");
         } 
         else if(y==0){
            System.out.println("the point exist on the x axis = ");
         }
         else{
            System.out.println("condition  are not matched ");
         }
    }
    
}
