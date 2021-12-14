class StudentConstThis {
  String name;
  int year;
  String grade;

  public StudentConstThis(String name, int year, String grade) {
    this.name = name + " haha";
    this.year = year;
    this.grade = grade;
  }

  public void printDetails() {
    // this keyword allows us to access the properties of the object from which the method is called
    System.out.println("I am " + this.name + ". I am in year " + this.year + ". I have an " + this.grade);
  }

  public static void main(String[] args) {
    StudentConstThis sebin = new StudentConstThis("Sebin", 10, "A");
    StudentConstThis vania = new StudentConstThis("Vani", 11, "A");
    StudentConstThis lee = new StudentConstThis("Lee", 12, "A");
    StudentConstThis jamie = new StudentConstThis("Jamie", 13, "A");

    sebin.printDetails(); // this => sebin. Which means that this.name => sebin.name
    vania.printDetails();
    lee.printDetails();
    jamie.printDetails();
  }
}