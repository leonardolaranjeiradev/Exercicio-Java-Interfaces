package model.services;

public interface ServicoPagamentoOnline {
	 double taxa(double valor);
	 double juros(double valor, int meses);

}
