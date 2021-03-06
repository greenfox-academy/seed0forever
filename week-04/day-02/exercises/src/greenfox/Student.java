package greenfox;

public class Student extends Person {

  String previousOrganization; // the name of the student’s previous company/school
  int skippedDays; // the number of days skipped from the course

  public Student() {
    this("Jane Doe", 30, "female", "The School of Life");
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    skippedDays = 0;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
  }

  void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from "
            + previousOrganization + " who skipped " + skippedDays
            + " days from the course already.");
  }

  void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

}
