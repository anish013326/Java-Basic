public class calPower {

  // public static int calculatePower(int x , int n){
  //   if (n==0) {
  //     return 1;
  //   }
  //   if (x==0) {
  //     return 0;
  //   }

  //   return x* calculatePower(x, n-1);
  // }

  public static int calculatePower(int x, int n){
    if(n==0){
      return 1;

    }
    if (x==0) {
      return 0 ;
    }
    // if n is even
    if (n%2==0) {
    return  calculatePower(x, n/2 ) * calculatePower(x, n/2);
    }
    else{
      return calculatePower(x, n/2) * calculatePower(x, n/2) * x ;
    }
    

  }
  public static void main (String []args){
   int result= calculatePower(10, 3);
   System.out.println(result);
  }
}
 