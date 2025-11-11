import java.util.Scanner;
import src.services.OnlinePaymentService;
import src.services.PaypalService;
import src.services.ContractService;
import src.entities.Contract;
import src.entities.Installment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner kb = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = kb.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(kb.next(), fmt);
        System.out.print("Contract value: ");
        double totalValue = kb.nextDouble();
        Contract contract = new Contract(number, date, totalValue);
        System.out.print("Enter number of installments: ");
        int months = kb.nextInt();

        kb.close();
        OnlinePaymentService onlinePaymentService = new PaypalService();
        ContractService contractService = new ContractService(onlinePaymentService);
        contractService.processContract(contract, months);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }
    }
}
