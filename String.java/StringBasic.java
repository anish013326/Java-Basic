
import java.util.*;

public class StringBasic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String str = sc.next(); // reads one word
    // String str = sc.nextLine(); // reads whole words
    // String str = "Anish";
    // System.out.println(str);

    String str = "Anish kumar";
    String str2 = "Patel";
    // String str2="Anish";
    // int len=str.length();
    // System.out.println(str.length());
    // char S=str.charAt(4);
    // System.out.println(str.charAt(0));                 // it gives char
    // System.out.println(str.indexOf('H'));              // it gives integer value
    // System.out.println(str.compareTo(str2));           // it gives 0,< 0,> 0
    // System.out.println(str.contains("is"));            // it gives boolen value
    // System.out.println(str.startsWith("Ani"));     
    // System.out.println(str.endsWith("ish"));  
    
    System.out.println(str.concat(str2));      

    sc.close();
  }
}
