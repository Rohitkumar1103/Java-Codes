public class remCycle{
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = next;
    }
  } 

  public static Node head; 

  public static boolean isCycle(){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next !=null){
      slow = slow.next; //+1
      fast = fast.next.next; //+2
      if(slow == fast){
        return true; //Cycle exists
      }
    }
    return false; //Cycle doesn't exists
  }
  public static void removeCycle(){
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while(fast != null && fast.next !=null){
      slow = slow.next; //+1
      fast = fast.next.next; //+2
      if(slow == fast){
        cycle = true;
        break;
      }
    }
    if(cycle == false){
      return;
    }
    slow = head;
    Node prev = null;
    while(slow != fast){
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }
    prev.next = null;
  }
  public static void main(String[] args){
    head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;
    //1->2->3->2
    System.out.println(isCycle());
    removeCycle();
    System.out.println(isCycle());
  }
}