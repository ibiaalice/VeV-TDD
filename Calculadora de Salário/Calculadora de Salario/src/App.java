import java.util.Scanner;

import controllers.MainController;
import models.Salary;


public class App {
    static Scanner sc = new Scanner(System.in);
    static MainController controller = new MainController();
    public static void main(String[] args) throws Exception {

        System.out.println("Calculadora de Salário");
        System.out.println("Digite o nome do funcionário:");
        String name = sc.nextLine();
        System.out.println("Digite o email do funcionário:");
        String email = sc.nextLine();
        System.out.println("Digite o salário base do funcionário:");
        double baseSalary = sc.nextDouble();
        System.out.println("Digite o cargo do funcionário:");
        String role = sc.next();
        sc.close();

        Salary salary = MainController.calculateSalary(name, email, baseSalary, role);

        System.out.println(salary.toString());
    }
}
