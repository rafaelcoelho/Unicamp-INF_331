package questao1.app;

import java.util.Scanner;

import bolsa.Bolsa;
import bolsa.INegociaAcaoReceptacle;
import observer.IAcaoObserver;
import observer.IAcaoSubject;
import questao1.comprador.Comprador;
import questao1.monitorCompra.IMonitorCompra;
import questao1.monitorCompra.MonitorCompra;

public class AppBolsa01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Bolsa bolsa = new Bolsa();
		IMonitorCompra monitor = new MonitorCompra();
		IAcaoObserver comprador = new Comprador();
		
		monitor.setLimiteValor(37);
		monitor.setEmpresaMonitorada("DinoUp");
		bolsa.attach((IAcaoObserver)monitor);
		((IAcaoSubject)monitor).attach(comprador);
		((INegociaAcaoReceptacle)comprador).connect(bolsa);
		
		bolsa.start();
		(new Scanner(System.in)).nextLine();
	}
}
