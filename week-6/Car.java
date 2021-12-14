public class Car {
  String model;
  String color;
  int speed;
  int noOfWheels  = 4;

  public static void main(String[] args) {
    Car ford = new Car();
    ford.model = "Focus";
    ford.color = "Green";
    ford.speed = 6;

    Car golf = new Car();
    golf.model = "Volkswagen";
    golf.color = "Red";
    golf.speed = 5;
    golf.noOfWheels = 5;

    System.out.println("You car is a " + ford.color + " " + ford.model + " that has " + ford.speed + " speed and " + ford.noOfWheels + " wheels");

    System.out.println("You car is a " + golf.color + " " + golf.model + " that has " + golf.speed + " speed and " + golf.noOfWheels + " wheels");
  }
}
