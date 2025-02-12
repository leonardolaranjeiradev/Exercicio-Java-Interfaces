package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {
	private LocalDate dataVencimento;
	private Double quantidade;
	
	 private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Parcelamento() {
	}

	public Parcelamento(LocalDate dataVencimento, Double quantidade) {
		this.dataVencimento = dataVencimento;
		this.quantidade = quantidade;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return fmt.format(dataVencimento) + " - " + String.format("%.2f", quantidade);
	}
	
	

}
