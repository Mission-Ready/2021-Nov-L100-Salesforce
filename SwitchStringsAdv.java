class SwitchStringsAdv {
  public static void main(String[] args) {
    String fruit = "Papaya";
    switch (fruit) {
      case "Orange":
        System.out.println("Oranges are $0.59 a pound.");
        break;
      case "Mango":
      case "Papaya":
        System.out.println("Mangoes and Papayas are $2.79 a pound.");
        break;
      default:
        System.out.println("Sorry, we are out of " + fruit);
    }
  }
}

/*
    javac SwitchStringsAdv.java
    java SwitchStringsAdv
**/