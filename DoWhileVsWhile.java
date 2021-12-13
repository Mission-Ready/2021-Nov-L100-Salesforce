class DoWhileVsWhile {
  public static void main(String[] args) {
    int age = 20;
    while (age < 18) {
      System.out.println("You are not old enough");
      age = age + 1;
    }
    System.out.println("You are good to go");
  }
}
