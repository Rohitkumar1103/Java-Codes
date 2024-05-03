public class combination{
  public static int factorial(int a){
    int fact =1;
    for(int i=1; i<=a; i++){
      fact=fact*i;
    }
    return fact;
  }

  public static int binomialCom(int n,int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int binCoeff = fact_n/(fact_r*fact_nmr);
    return binCoeff;
  }
  public static void main(String[] args){
    int com = binomialCom(5,2);
    System.out.println(com);
  }
}