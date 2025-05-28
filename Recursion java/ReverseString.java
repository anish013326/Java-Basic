public class ReverseString {

  public static String RevString(String input) {
    if (input.isEmpty()) {
      return input;
    }

    return RevString(input.substring(1)) + input.charAt(0);

  }

  public static void main(String[] args) {

    String input = "ANISH";
    String result = RevString(input);
    System.out.println("reverse string is: " + result);

  }

}
