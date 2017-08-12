package questao2.monitorVenda;

import observer.IAcaoObserver;
import observer.IAcaoSubject;

public class MonitorVenda implements IMonitorVenda, IAcaoSubject, IAcaoObserver {

	@Override
	public void updateAcao(String empresaAcao, int valorAcao) {
		
	}

	@Override
	public void attach(IAcaoObserver comprador) {
		
	}

	@Override
	public String getEmpresaMonitorada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEmpresaMonitorada(String empresaMonitorada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getLimiteValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLimiteValor(double limiteValor) {
		// TODO Auto-generated method stub
		
	}

}