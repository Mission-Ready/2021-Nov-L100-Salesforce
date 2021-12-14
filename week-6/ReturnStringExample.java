class ReturnStringExample {
  public static void main(String[] args) {
    String result = sayHi(); // this is where we called the method from.
    System.out.println(result);
  }
  
  // Now the return type is String.
  // Method definition
  public static String sayHi() {
    return "Hi Sebin";
  }
}