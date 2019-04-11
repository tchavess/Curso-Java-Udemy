package model.services;

public class PaypalService implements OnlinePaymentService {

	private static final double taxPercent = 0.01;
	private static final double jurosMensal = 0.02;

	@Override
	public double pagamentoTaxa(double montante) {
		return montante * jurosMensal;
	}

	@Override
	public double juros(double montante, int meses) {
		return montante * taxPercent * meses;
	}

}
