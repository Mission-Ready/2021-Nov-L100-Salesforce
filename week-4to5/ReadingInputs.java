class ReadingInputs {
  public static void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String myString = input.nextLine();
    System.out.println("You've entered: " + myString);
    input.close();

    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter name and age:");
    // String name = input.nextLine();
    // int age = input.nextInt();

    // // Output input by user
    // System.out.println("Name: " + name);
    // System.out.println("Age: " + age);
  }
}
