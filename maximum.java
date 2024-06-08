import java.util.*;

public class maximum{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
    
    int max = Integer.MIN_VALUE;
    for(int i=0; i<list.size();i++){
      if(max<list.get(i)){
        max = list.get(i);
      }
    }
    System.out.println("Max Element:" +max);
  }
}