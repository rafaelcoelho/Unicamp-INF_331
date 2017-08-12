package questao2.vendedor;

import bolsa.INegociaAcao;
import bolsa.INegociaAcaoReceptacle;
import observer.IAcaoObserver;

public class Vendedor implements IAcaoObserver, INegociaAcaoReceptacle {

	private INegociaAcao negociaAcao;
	
	@Override
	public void updateAcao(String empresaAcao, int valorAcao) {
		negociaAcao.vendaAcao(empresaAcao, valorAcao);
	}

	@Override
	public void connect(INegociaAcao negociaAcao) {
		this.negociaAcao = negociaAcao;
	}
	
}