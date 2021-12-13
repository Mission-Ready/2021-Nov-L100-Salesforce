class DoWhile {
  public static void main(String[] args) {
    int age = 20;
    do {
      System.out.println("You are not old enough");
      age = age + 1; // 21
    } while (age < 18); // 21< 18 => False
    System.out.println("You are good to go");
  }
}
