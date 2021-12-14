class Student {
  String name;
  int year;
  String grade;

  public Student(String studentName, int studentYear, String studentGrade) {
    name = studentName;
    year = studentYear;
    grade = studentGrade;
  }

  public static void main(String[] args) {
    Student sebin = new Student("Sebin", 10, "A");
    Student vania = new Student("Vani", 11, "A");
    Student lee = new Student("Lee", 12, "A");
    Student jamie = new Student("Jamie", 13, "A");

    System.out.println("I am " + sebin.name + ". I am in year " + sebin.year + ". I have an " + sebin.grade );
    System.out.println("I am " + vania.name + ". I am in year " + vania.year + ". I have an " + vania.grade );
    System.out.println("I am " + lee.name + ". I am in year " + lee.year + ". I have an " + lee.grade );
    System.out.println("I am " + jamie.name + ". I am in year " + jamie.year + ". I have an " + jamie.grade );
  }

  public void printDetails() {
  }

}