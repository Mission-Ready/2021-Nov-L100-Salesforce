class SwitchStrings {
  public static void main(String[] args) {
    String fruit = "Papayas";
    switch (fruit) {
      case "Oranges":
        System.out.println("Oranges are $0.59 a pound.");
        break;
      case "Mangoes":
        System.out.println("Mangoes are $2.79 a pound.");
        break;
      case "Papayas":
        System.out.println("Papayas are $2.79 a pound.");
        break;
      default:
        System.out.println("Sorry, we are out of " + fruit);
    }
  }
}

/*
    javac SwitchStrings.java
    java SwitchStrings
**/