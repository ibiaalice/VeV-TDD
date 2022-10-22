import java.util.Scanner;

import controller.MainController;

public class App {
   static Scanner scanner = new Scanner(System.in);
   static MainController mainController = new MainController();

    public static void main(String[] args) throws Exception {
        System.out.println("Informe o nome do cliente: ");
        String name = scanner.nextLine();
        System.out.println("Informe o endereço do cliente: ");
        String address = scanner.nextLine();
        System.out.println("Informe o tipo de serviço: ");
        String serviceType = scanner.nextLine();
        System.out.println("Informe o valor do serviço: ");
        Float value = scanner.nextFloat();

        System.out.println("Gerando nota fiscal...");

        mainController.generatedInvoice(name, address, serviceType, value);

    }
}
