import java.util.Scanner;

public class Difference {
  public static int getNumber() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x = input.nextInt();
    input.close();
    return x;
  }

  public static int subtract(int i, int j) {
    return (i - j);
  }

  public static void main(String[] args) {
    int i = getNumber();
    int j = getNumber();
    System.out.println(i + " minus " + j + " is " + subtract(i, j));
  }
}