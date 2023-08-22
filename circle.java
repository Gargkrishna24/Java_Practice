/* Given the coordinates (x,y) of a centre of a circle and it radius , WAP which
 * will detremines wheather a points lies inside the circle. on the circle or 
 * outside sthe circle..........
  */
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println(sc);
     System.out.println("enter the radius =");
     int r = sc.nextInt();  // RADIUS 
     System.out.println("enter the 'x' =");
     int x = sc.nextInt();
     System.out.println("enter the 'x1' =");
     int x1 = sc.nextInt();
     System.out.println("enter the 'y' =");
     int y = sc.nextInt();
     System.out.println("enter the 'y1' =");
     int y1 = sc.nextInt();
     int OA = ((x-x1)*(x-x1))-((y-y1)*(y-y1));
     if(OA*OA>r*r){
        System.out.println("points lies outside circle ");
     }
     else if(OA*OA<r*r){
        System.out.println("points lies inside the circle ");
     }
     else if(OA*OA==r*r){
        System.out.println("points lies on the circle ");
     }

    }
    
}
