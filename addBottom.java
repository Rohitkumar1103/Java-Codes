import java.util.*;

public class addBottom{
  public static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  } 
  public static void main(String[] args){
    Stack <Integer> s = new Stack<>();
    s.push(3);
    s.push(9);
    s.push(5);

    pushAtBottom(s, 4); 

    while(!s.isEmpty()){
      System.out.println(s.pop());
    }
  }
}