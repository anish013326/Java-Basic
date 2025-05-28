public class StringComparison {
  public static void main(String[] args) {

    // String literals are stored in the String pool (inside JVM heap memory)
    String str1 = "Anish";
    String str2 = "Anish";

    // New keyword creates a new object in the heap (not the pool)
    String str3 = new String("Anish");

    // == compares references (memory addresses)
    System.out.println("str1 == str2 : " + (str1 == str2));  // true – both point to same pool memory
    System.out.println("str1 == str3 : " + (str1 == str3));  // false – str3 is a new object in heap

    // .equals() compares the actual content (characters of the string)
    System.out.println("str1.equals(str2) : " + str1.equals(str2));  // true – contents are same
    System.out.println("str1.equals(str3) : " + str1.equals(str3));  // true – contents are same

    // Extra Case: intern() makes str3 point to string pool version
    System.out.println("str1 == str3.intern() : " + (str1 == str3.intern()));  // true
  }
}
