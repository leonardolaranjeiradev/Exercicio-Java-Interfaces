package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcelamento;

public class ServicoContrato {
	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processoDeContrato(Contrato contrato, int meses) {
		
		double parcelaBruta = contrato.getValorContrato() / meses;
		
		for (int i = 1; i <= meses; i++ ) {
			LocalDate vencimento = contrato.getDataContrato().plusMonths(i);						
			
			double juros = servicoPagamentoOnline.juros(parcelaBruta, i);
			double taxa = servicoPagamentoOnline.taxa(parcelaBruta + juros);
			double parcela = parcelaBruta + taxa + juros;
			
			contrato.getParcelamentos().add(new Parcelamento(vencimento, parcela));
		}
	}
	
}
