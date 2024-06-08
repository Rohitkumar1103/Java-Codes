import java.util.ArrayList;

public class operations{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();

    //Add Operation O(1)
    list.add(2);
    list.add(4);
    list.add(1);
    list.add(7);
    System.out.println(list);

    list.add(3, 10);
    System.out.println(list);
  
    // //Get Operation O(1)
    // int element = list.get(3);
    // System.out.println(element);

    // //Remove operation O(n)
    // list.remove(2);
    // System.out.println(list);

    // //Set operation O(n)
    // list.set(2, 10);
    // System.out.println(list);

    // //Contain operation O(n)
    // System.out.println(list.contains(5));
    // System.out.println(list.contains(4));

  }
}