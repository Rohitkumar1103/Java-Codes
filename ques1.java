
import java.util.*;

public class ques1 {

    public boolean containsDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        ques1 q = new ques1();

        System.out.println(q.containsDuplicate(arr));
    }
}
