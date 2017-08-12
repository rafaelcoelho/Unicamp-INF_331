package questao1.comprador;

import bolsa.INegociaAcao;
import bolsa.INegociaAcaoReceptacle;
import observer.IAcaoObserver;

public class Comprador implements IAcaoObserver, INegociaAcaoReceptacle {
	
	private INegociaAcao negociaAcao;
	
	@Override
	public void updateAcao(String empresaAcao, int valorAcao) {
		negociaAcao.compraAcao(empresaAcao, valorAcao);
	}

	@Override
	public void connect(INegociaAcao negociaAcao) {
		this.negociaAcao = negociaAcao;
		
	}
}