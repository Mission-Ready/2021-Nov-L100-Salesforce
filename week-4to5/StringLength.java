import java.util.Scanner;
class StringLength {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter some message");
    String myInput = input.nextLine(); //reads a line of text from the user
    System.out.println("You have entered : " + myInput.toUpperCase());
    System.out.println("It is " + myInput.length() + " characters long");
    
    input.close();
  }
}
