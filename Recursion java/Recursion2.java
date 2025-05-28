// wap to decrease 100 to 50 counting number 

public class Recursion2 {
  public static void desCounting(int n){
    if(n==50){
      return ;
    }

    System.out.println(n);
    desCounting(n-2);
  }
  public static void main(String[] args) {

    int n = 100;
    desCounting(n);

  }
}
