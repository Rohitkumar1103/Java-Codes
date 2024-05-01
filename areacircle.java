import java.util.*;

public class areacircle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    int rad = sc.nextInt();
    float area = 3.14f * rad * rad;
    System.out.println("Area of the circle is " +area);
  }
}