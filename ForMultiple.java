import java.util.Scanner;

public class ForMultiple {
  public static void main(String[] args) {
    // Multiple of 3 => When you divide a num by 3, it should have 0 remainder.
    // % operator => checks if there is a remainder other than 0.

    for (int i = 1; i <= 20; i++) {
      if ((i % 3) == 0) {
        System.out.println(i);
      }
    }

    // for (int i = 1; i <= 20; i++) {
    // if ((i % 6) == 0) {
    // System.out.println(i);
    // }
    // }

    // for (int i = 3; i <= 18; i = i + 3) {
    // System.out.println(i);
    // }

    // for (int i = 1; (i * 3) <= 20; i++) {
    // System.out.println("i is "+ i);
    // System.out.println(i * 3);
    // }
  }
}
