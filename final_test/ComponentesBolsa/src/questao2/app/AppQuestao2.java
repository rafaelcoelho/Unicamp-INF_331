package questao2.app;

import java.util.Scanner;

import bolsa.Bolsa;
import bolsa.INegociaAcaoReceptacle;
import observer.IAcaoObserver;
import observer.IAcaoSubject;
import questao2.monitorVenda.IMonitorVenda;
import questao2.monitorVenda.MonitorVenda;
import questao2.vendedor.Vendedor;

public class AppQuestao2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Bolsa bolsa = new Bolsa();
		IMonitorVenda monitor = new MonitorVenda();
		IAcaoObserver comprador = new Vendedor();
		
		monitor.setLimiteValor(56);
		monitor.setEmpresaMonitorada("Pirapora");
		bolsa.attach((IAcaoObserver)monitor);
		((IAcaoSubject)monitor).attach(comprador);
		((INegociaAcaoReceptacle)comprador).connect(bolsa);
		
		bolsa.start();
		(new Scanner(System.in)).nextLine();
	}
}
