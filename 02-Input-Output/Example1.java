import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner UseNam = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username please:");

    String userName = UseNam.nextLine();  // Read user input
    System.out.println("your username is: " + userName);  // Output user input
  }
}
