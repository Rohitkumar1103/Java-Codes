public class pairNumber{
  public static void pairs(int arr[]){
    int totalPairs = 0;
    for(int i=0; i<arr.length; i++){
      int current = arr[i];
      for(int j=i+1; j<arr.length; j++){
        System.out.print("( "+current+ "," +arr[j]+ ") ");
        totalPairs++;
      }
      System.out.println();
    }
    System.out.print("Total pairs: "+totalPairs);
  }
  public static void main(String[] args){
    int arr[] = {29, 54, 23, 98, 21 , 11, 40};
    pairs(arr);
  }
}