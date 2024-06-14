public class addAnyPos{
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
  public static int size;

  public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if( head == null){
      head = tail = newNode;
      return;
    }    
    newNode.next = head;
    head = newNode;
  }

  public void addAt(int data, int index){
    if(index==0){
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node  temp = head;
    int i=0;
    while(i< index -1){
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    
  }

  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+"-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public static void main(String[] args){
    addAnyPos ll = new addAnyPos();
    ll.addFirst(5);
    ll.print();
    ll.addFirst(8);
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addAt(3,2);
    ll.print();
    System.out.println(ll.size);
  }
}