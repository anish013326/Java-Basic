// wap to calculate sum of n natural number 
public class Recursion4 {
  public static void addNatural(int i, int n, int sum) {
    if (i == n) {
      sum += i;
      System.out.println(sum);
      return;
    }
    sum += i;
    addNatural(i + 1, n, sum);
    // System.out.println(i);

  }

  public static void main(String[] args) {
    addNatural(1, 5, 0);
  }

}
