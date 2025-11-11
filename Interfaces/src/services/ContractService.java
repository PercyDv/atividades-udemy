package src.services;

import java.time.LocalDate;

import src.entities.Contract;
import src.entities.Installment;

public class ContractService {

   private OnlinePaymentService onlinePaymentService;


   public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            contract.getInstallments().add(new Installment(dueDate, fullQuota));
        }
    }
}
