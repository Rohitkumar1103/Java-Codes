public class deleteLast{
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = next;
    }
  } 
  public static Node head;
  public static Node tail;
  
  public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+"-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public int delete(){
    if(tail == null){
      System.out.println("Linked List is Empty.");
      return Integer.MIN_VALUE;
    } else if(head == tail){
      int val = tail.data;
      head = tail = null;
      return val;
    }

    Node prev = head;
    while(prev.next !=tail){
      prev = prev.next;
    }
    int val = prev.next.data;  
    prev.next = null;
    tail = prev;
    return val;

  }
  public static void main(String[] args){
    deleteLast ll = new deleteLast();
    ll.addLast(6);
    ll.addLast(3);
    ll.addLast(9);
    ll.print();
    System.out.println(tail.data);
    ll.delete();
    ll.print();


  }
}