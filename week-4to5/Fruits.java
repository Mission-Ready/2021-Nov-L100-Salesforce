class Fruits {
  public static void main(String[] args) {
    String fruit = "Mango";
    switch (fruit) {
      case "Orange":
        System.out.println("Oranges are $0.59 a pound.");
        break;
      case "Mango":
        // System.out.println("Mangoes & Papayas are $2.79 a pound.");
        // break;
      case "Papaya":
        System.out.println("Mangoes & Papayas are $2.79 a pound.");
        break;
      default:
        System.out.println("Sorry, we are out of " + fruit);
    }
  }
}
