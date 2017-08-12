package bolsa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

import lifecycle.IRun;
import observer.IAcaoObserver;
import observer.IAcaoSubject;

public class Bolsa implements INegociaAcao, IAcaoSubject, ActionListener, IRun {
	public final static int STANDARD_INTERVAL = 2000;
	
    private int interval = STANDARD_INTERVAL;
    
    private Timer metro;
    private ArrayList<IAcaoObserver> observerList = new ArrayList<IAcaoObserver>();
    
    private String listaNomes[] = {"DinoUp", "Jurassic Park", "WestWorld", "Pirapora"};
    
    public int getInterval() {
    	return interval;
    }
    
    public Bolsa() {
        metro = new Timer(interval, this);
    }
    
    public void start() {
        metro.start();
    }
    
    public void stop() {
        metro.stop();
    }
    
    public void actionPerformed(ActionEvent evt) {
    	int valor = (int)(Math.random() * 130);
    	
    	int nomeTemp = (int)(Math.random() * listaNomes.length);
    	System.out.println("Empresa: " + listaNomes[nomeTemp] + "  R$ "+valor);
    	notifyObservers(listaNomes[nomeTemp], valor);
    }
    
    private void notifyObservers(String empresaAcao, int valorAcao) {
    	for (IAcaoObserver o : observerList) {
			o.updateAcao(empresaAcao, valorAcao);
		}
    }

	@Override
	public void attach(IAcaoObserver observer) {
    	observerList.add(observer);
	}

	@Override
	public void compraAcao(String empresaAcao, double valorAcao) {
		System.out.println("Ação da empresa "+empresaAcao + " comprada a R$ " + valorAcao);

	}

	@Override
	public void vendaAcao(String empresaAcao, double valorAcao) {
		System.out.println("Ação da empresa "+empresaAcao + " vendida a R$ " + valorAcao);
		
	}
}
