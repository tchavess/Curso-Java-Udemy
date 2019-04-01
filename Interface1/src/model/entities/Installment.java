package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dtVencimento;
	private Double montante;

	public Installment() {
	}

	public Installment(Date dtVencimento, Double montante) {
		this.dtVencimento = dtVencimento;
		this.montante = montante;
	}

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Double getMontante() {
		return montante;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}

	@Override
	public String toString() {
		// return "Installment [sdf=" + sdf + ", dtVencimento=" + dtVencimento + ",
		// montante=" + montante + "]";
		return sdf.format(dtVencimento) + " - " + String.format("%.2f", montante);
	}

}
