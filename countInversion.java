public class countInversion {

    public static int countInversions(int[] arr) {
        int n = arr.length;
        int inversions = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    inversions++;
                }
            }
        }

        return inversions;
    }

    public static void main(String[] args) {
        int[] arr = {70, 50, 60, 10, 20, 30, 80, 15};
        int inversionCount = countInversions(arr);
        System.out.println("Inversion count: " + inversionCount);
    }
}
