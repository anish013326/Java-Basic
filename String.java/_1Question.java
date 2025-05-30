// Task: Convert uppercase letters to lowercase and lowercase to uppercase in a string

import java.util.Scanner;

public class _1Question {
  public static void main(String[] args) {
    // Taking user input
    Scanner sc = new Scanner(System.in);

    // Read the full input line (string with spaces)
    StringBuilder str = new StringBuilder(sc.nextLine());

    // Loop through each character in the string
    for (int i = 0; i < str.length(); i++) {
      boolean flag = true; // assume current char is uppercase

      char ch = str.charAt(i); // get the character at index i

      if (ch == ' ')
        continue; // skip spaces, no need to toggle

      int asci = (int) ch; // get ASCII value of the character

      if (asci >= 97)
        flag = false; // it's a lowercase character

      if (flag == true) {
        // If uppercase, convert to lowercase by adding 32 in ASCII
        asci += 32;
        char dh = (char) asci;
        str.setCharAt(i, dh); // update the character
      } else {
        // If lowercase, convert to uppercase by subtracting 32
        asci -= 32;
        char dh = (char) asci;
        str.setCharAt(i, dh); // update the character
      }
    }

    // Print the final toggled string
    System.out.println(str);

    sc.close(); // Close the scanner
  }
}
