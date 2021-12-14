class StudentStatic {
  String name;
  int year;
  String grade;

  public StudentStatic(String studentName, int studentYear, String studentGrade) {
    name = studentName;
    year = studentYear;
    grade = studentGrade;
  }

  public void printDetails() {
    // this keyword allows us to access the properties of the object from which the method is called
    System.out.println("I am " + this.name + ". I am in year " + this.year + ". I have an " + this.grade);
  }

  public static void main(String[] args) {
    StudentStatic sebin = new StudentStatic("Sebin", 10, "A");
    StudentStatic vania = new StudentStatic("Vani", 11, "A");
    StudentStatic lee = new StudentStatic("Lee", 12, "A");
    StudentStatic jamie = new StudentStatic("Jamie", 13, "A");

    sebin.printDetails(); // this => sebin. Which means that this.name => sebin.name
    vania.printDetails();
    lee.printDetails();
    jamie.printDetails();
  }
}