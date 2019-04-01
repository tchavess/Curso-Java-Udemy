package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contrato, int meses) {
		double valorBasico = contrato.getValorTotal() / meses;
		for (int i = 1; i <= meses; i++) {
			Date date = addMonths(contrato.getData(), i);
			double basicoMensal = valorBasico + onlinePaymentService.juros(valorBasico, i);
			double totalMensal = basicoMensal + onlinePaymentService.pagamentoTaxa(basicoMensal);
			contrato.addInstallment(new Installment(date, totalMensal));
		}

	}

	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
