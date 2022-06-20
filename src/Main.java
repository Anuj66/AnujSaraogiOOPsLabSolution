import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your First Name : ");
    String firstName = sc.nextLine();

    System.out.println("Enter your Last Name : ");
    String lastName = sc.nextLine();

    Employee employee = new Employee(firstName, lastName);

    System.out.println("Enter your Department Number : 1.Technical 2.Admin 3.HR 4.Legal - ");
    int choice = sc.nextInt();

    String department = "";
    switch (choice) {
      case 1:
        department = "Technical";
        break;
      case 2:
        department = "Admin";
        break;
      case 3:
        department = "HR";
        break;
      case 4:
        department = "Legal";
        break;
      default:
        System.out.println("Entered wrong department number");
    }

    CredentialService credentialService = new CredentialService();

    // Generating Email
    employee.setEmail(credentialService.generateEmail(employee, department));

    // Generating Password
    employee.setPassword(credentialService.generatePassword(10));

    // Displaying Credentials
    credentialService.showCredentials(employee);

  }
}
