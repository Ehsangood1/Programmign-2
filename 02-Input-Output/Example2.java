import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = type.nextLine();

    // Numerical input
    int age = type.nextInt();
    double salary = type.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
