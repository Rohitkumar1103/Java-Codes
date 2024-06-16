public class reverse{
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
  public void rev(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }
  public static void main(String[] args){
    reverse ll = new reverse();
    ll.addLast(6);
    ll.addLast(3);
    ll.addLast(7);
    ll.addLast(2);
    ll.addLast(9);
    ll.print();

    ll.rev();
    ll.print();
  }
}