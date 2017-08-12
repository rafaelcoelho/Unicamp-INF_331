package questao1.monitorCompra;

import java.util.ArrayList;

import observer.IAcaoObserver;
import observer.IAcaoSubject;

public class MonitorCompra implements IMonitorCompra, IAcaoSubject, IAcaoObserver {
	private String empresaMonitorada;
	private double limiteValor;

	private ArrayList<IAcaoObserver> observerList = new ArrayList<IAcaoObserver>();

	public MonitorCompra() {
		super();
	}

	public void attach(IAcaoObserver observer) {
		observerList.add(observer);
	}

	private void notifyObservers(String nome, int valor) {
		if(nome.equals(getEmpresaMonitorada()) && valor<getLimiteValor() ) {
			for (IAcaoObserver o : observerList) {
				o.updateAcao(nome, valor);
			}
		}
	}

	@Override
	public void updateAcao(String empresaAcao, int valorAcao) {
		notifyObservers(empresaAcao, valorAcao);	
	}

	public String getEmpresaMonitorada() {
		return empresaMonitorada;
	}

	public void setEmpresaMonitorada(String empresaMonitorada) {
		this.empresaMonitorada = empresaMonitorada;
	}

	public double getLimiteValor() {
		return limiteValor;
	}

	public void setLimiteValor(double limiteValor) {
		this.limiteValor = limiteValor;
	}
}
