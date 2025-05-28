public class StringBuilder_3 {
  public static void main(String[] args) {

    // Step 1: Create a StringBuilder object with the initial string
    StringBuilder str = new StringBuilder("Hello how are You ?");
    
    // Print the original string
    System.out.println(str);  // Output: Hello how are You ?

    // Step 2: Reverse the entire string
    str.reverse();
    
    // Print the reversed string
    System.out.println(str);  // Output: ? uoY era woh olleH

    // Step 3: Reverse it again to restore original content
    str.reverse();  // Now it's back to: Hello how are You ?

    // Step 4: Delete characters from index 2 to 5 (5 is exclusive)
    // This removes characters at index 2, 3, and 4 ("llo")
    str.delete(2, 5);

    // Print the final string after deletion
    System.out.println(str);  // Output: He how are You ?
  }
}
