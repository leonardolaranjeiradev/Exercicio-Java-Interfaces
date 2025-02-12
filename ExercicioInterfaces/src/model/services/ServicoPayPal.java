package model.services;

public class ServicoPayPal implements ServicoPagamentoOnline {

	@Override
	public double taxa(double valor) {
		return valor * 0.02;
	}

	@Override
	public double juros(double valor, int meses) {
		return valor * 0.01 * meses;
	}

}
