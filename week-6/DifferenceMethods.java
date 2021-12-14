import java.util.Scanner;

class DifferenceMethods {
  public static void main(String args[]) {
    int result = readNumbers();
    System.out.println(result);
  }

  public static int readNumbers() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two numbers \n");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    input.close();

    int difference = findDifference(num1, num2);
    return difference;
  }

  public static int findDifference(int num1, int num2) {
    return num1 - num2;
  }

}
