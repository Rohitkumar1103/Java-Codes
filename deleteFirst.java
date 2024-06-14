public class deleteFirst{
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data){
    Node newNode = new Node(data);
    if(head== null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
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
    if(head == null){
      System.out.println("Linked List is Empty");
      return Integer.MIN_VALUE;
    } else if(head == tail){
        int val = head.data;
        head = tail = null;
        return val;
    }
    int val = head.data;
    head = head.next;
    return val;
  }
  public static void main(String[] args) {
    deleteFirst ll = new deleteFirst();
    ll.addFirst(4);
    ll.addFirst(6);
    ll.addFirst(1);
    ll.addFirst(9);
    ll.print();
    ll.delete();
    ll.print();
  }
}