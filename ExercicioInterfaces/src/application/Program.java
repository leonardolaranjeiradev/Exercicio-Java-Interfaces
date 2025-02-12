package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelamento;
import model.services.ServicoContrato;
import model.services.ServicoPayPal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();

		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);

		System.out.print("Valor do contrato: ");
		double valorContrato = sc.nextDouble();		

		Contrato contrato = new Contrato(numero, dataContrato, valorContrato);
		
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPayPal());
		
		servicoContrato.processoDeContrato(contrato, parcelas);
		
		System.out.println("Parcelas:");
		
		for (Parcelamento parcelamento : contrato.getParcelamentos()) {
			System.out.println(parcelamento);
		}
		
		

		sc.close();
	}

}
