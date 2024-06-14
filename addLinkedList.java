public class addLinkedList{
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data =data;
      this.next = null; 
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data){
    Node newNode =new Node(data);
    if(head == null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head  = newNode;
  }

  public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void printLL(){
    Node temp = head;
    if(head == null){
      System.out.println("Linked List is empty");
      return;
    }
    while(temp != null){
      System.out.print(temp.data+ "-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args){
    addLinkedList ll = new addLinkedList();
    ll.addFirst(5);
    ll.printLL();
    ll.addFirst(3);
    ll.printLL();
    ll.addLast(9);
    ll.printLL();
    ll.addLast(1);
    ll.printLL();
  }
}