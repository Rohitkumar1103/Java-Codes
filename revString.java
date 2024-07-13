import java.util.*;

public class revString{
  public static String reverseString(String Str){
    Stack<Character> s= new Stack<>();
    int idx = 0;
    while(idx < Str.length()){
      s.push(Str.charAt(idx));
      idx++; 
    } 
    StringBuilder result = new StringBuilder("");
    while(!s.isEmpty()){
      char curr = s.pop();
      result.append(curr);
    }
    return result.toString();
  }
  public static void main(String[] args){
    String str = "Keyboard";
    String result = reverseString(str);
    System.out.print(result);
  }
}