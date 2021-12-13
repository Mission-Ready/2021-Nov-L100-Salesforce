public class ForIncrement {
  public static void main(String[] args) {
    System.out.println("Before the loop");
    for (int i = 1; i <= 5; i++) {
      // here
      if (i == 3) {
        continue;
      }
      System.out.println(i);
    }
    System.out.println("After the loop");
  }
}
