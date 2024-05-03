import java.util.*;

public class factorial{
  public static int fact(int a){
    int facto = 1;
    for(int i=1; i <=a; i++){
      facto = facto*i;
    }
    return facto;
}
  public static void main(String[] args){
    int facto = fact(4);
    System.out.println(facto);
  }
}