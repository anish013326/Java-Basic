public class StringBuilder_1 {
  public static void main(String[] args) {

   
    // Unlike String, StringBuilder is mutable (can be changed)
    StringBuilder str = new StringBuilder("ANISH");

    // Print the current value of str
    System.out.println(str);  // Output: ANISH

    // Append " patel" to the existing StringBuilder object
    // No new object is created, original one is modified in memory
    str.append(" patel");

    // Print the updated value of str
    System.out.println(str);  // Output: ANISH patel

    
  }
}
