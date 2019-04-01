package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer numero;
	private Date data;
	private Double valorTotal;

	private List<Installment> parcelas = new ArrayList<>();

	public Contract() {
	}

	public Contract(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Installment> getParcelas() {
		return parcelas;
	}

	public void addInstallment(Installment installment) {
		parcelas.add(installment);
	}

	public void removeInstallment(Installment installment) {
		parcelas.remove(installment);
	}

}
