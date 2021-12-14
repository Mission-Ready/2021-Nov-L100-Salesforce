class ObjectsBasics2 {
  int x = 5; // Property x of type Integer

  public static void main(String[] args) {
    // Creating a new object and assigning it to a variable called myObj
    ObjectsBasics2 myObject = new ObjectsBasics2();
    // Accessing the property z from the object called myObject
    System.out.println("Before: " + myObject.x);
    myObject.x = 10;
    System.out.println("After: " + myObject.x);
  }
}
