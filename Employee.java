package online;
import java.util.Scanner;

public class Employee {

    // ANSI colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    // Store account details
    static String registeredUsername;
    static String registeredPassword;
    static String registeredName;
    static String registeredSurname;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(CYAN + "====== Create Employee Account ======" + RESET);
        System.out.print("Enter Username       : ");
        registeredUsername = sc.nextLine();

        System.out.print("Enter Password       : ");
        registeredPassword = sc.nextLine();

        System.out.print("Enter First Name     : ");
        registeredName = sc.nextLine();

        System.out.print("Enter Last Name      : ");
        registeredSurname = sc.nextLine();

        System.out.println(GREEN + "✅ Account created successfully!\n" + RESET);

        System.out.println(CYAN + "====== Employee Login ======" + RESET);
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
            System.out.println(GREEN + "\n✅ Login Successful!\n" + RESET);

            // Proceed to payslip
            System.out.print("Enter Employee ID        : ");
            int empId = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Basic Salary       : ₹");
            double basicSalary = sc.nextDouble();

            System.out.print("Enter Bonus              : ₹");
            double bonus = sc.nextDouble();

            System.out.print("Enter Tax Deducted       : ₹");
            double tax = sc.nextDouble();

            double netSalary = basicSalary + bonus - tax;

            System.out.println(YELLOW + "\n========== PAYSLIP ==========" + RESET);
            System.out.println("Employee ID     : " + empId);
            System.out.println("Employee Name   : " + registeredName + " " + registeredSurname);
            System.out.println("Basic Salary    : ₹" + basicSalary);
            System.out.println("Bonus           : ₹" + bonus);
            System.out.println("Tax Deducted    : ₹" + tax);
            System.out.println("------------------------------");
            System.out.println("Net Salary      : ₹" + netSalary);
            System.out.println(YELLOW + "==============================" + RESET);
            System.out.println();
            System.out.println("\u001B[33m✨ Thank you for using the Employee Management System! ✨\u001B[0m");
            System.out.println("\u001B[36mHave a great day, " + registeredName + " 😊\u001B[0m");
            } else {
            System.out.println(RED + "\n❌ Login Failed! Invalid credentials." + RESET);
        }

        sc.close();
    }
}
