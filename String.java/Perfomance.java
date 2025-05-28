public class Perfomance {
  public static void main(String[] args) {
    
    // Step 1: Declare and initialize an empty String
    // Strings in Java are immutable, so this variable 'str' cannot be changed directly
    String str = "";

    // Step 2: Start a loop from 1 to 9
    for (int i = 1; i < 10; i++) {

      // Step 3: Concatenate 'str' with current value of 'i'
      // Important: Each time you use +=, Java creates a new String object
      // Internally:
      // str = new StringBuilder(str).append(i).toString();
      // So for each iteration:
      // 1. A new StringBuilder is created
      // 2. str is appended with 'i'
      // 3. A new String object is returned and assigned to 'str'
      // 4. The old 'str' object becomes unused (garbage)
      str += i;
    }

    // Step 4: Print the final value of str
    // Output: 123456789
    // This is the result of all the concatenations in the loop
    System.out.println(str);
  }
}
