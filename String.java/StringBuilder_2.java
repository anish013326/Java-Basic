public class StringBuilder_2 {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("ANISH");
    System.out.println(str);
    str.setCharAt(1, 'P');
    System.out.println(str);
    str.append(19);
    System.out.println(str);
    str.insert(1, 'A');
    System.out.println(str);
    str.deleteCharAt(1);
    System.out.println(str);
  }
  
}
