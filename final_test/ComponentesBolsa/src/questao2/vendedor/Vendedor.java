package questao2.vendedor;

import bolsa.INegociaAcao;
import bolsa.INegociaAcaoReceptacle;
import observer.IAcaoObserver;

public class Vendedor implements IAcaoObserver, INegociaAcaoReceptacle {

	@Override
	public void connect(INegociaAcao negociacaoAcao) {
		
	}

	@Override
	public void updateAcao(String empresaAcao, int valorAcao) {
		
	}
	
}