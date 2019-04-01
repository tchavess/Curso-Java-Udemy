package model.services;

public interface OnlinePaymentService {
	
	double pagamentoTaxa(double montante);
	double juros(double montante, int meses );

}
