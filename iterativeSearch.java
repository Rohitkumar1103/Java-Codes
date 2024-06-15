public class iterativeSearch{
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
  public int search(int key){
    Node temp = head;
    int i=0;

    while(temp != null){
      if(temp.data == key){
        return i;
      }
      temp= temp.next;
      i++;
    }
    return -1;
  }
  public static void main(String[] args){
    iterativeSearch ll = new iterativeSearch();
    ll.addLast(6);
    ll.addLast(3);
    ll.addLast(7);
    ll.addLast(2);
    ll.addLast(9);
    ll.print();

    System.out.println(ll.search(9));
  }
}