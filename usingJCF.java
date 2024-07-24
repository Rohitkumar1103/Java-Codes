
import java.util.*;

public class usingJCF {

    public static void main(String[] args) {
        //Queue q = new Queue();
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(5);
        q.add(8);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
