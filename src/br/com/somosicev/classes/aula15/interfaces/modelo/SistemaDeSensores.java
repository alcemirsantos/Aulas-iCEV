package br.com.somosicev.classes.aula15.interfaces.modelo;

import java.util.Enumeration;
import java.util.Vector;

import br.com.somosicev.classes.aula15.interfaces.visao.EscutadorDeAlarme;

public class SistemaDeSensores {
	// Vector é sincronizado, se não for necessário, usar ArrayList
	private Vector<EscutadorDeAlarme> listeners = new Vector<EscutadorDeAlarme>();

    public void registrar(EscutadorDeAlarme alarmListener) {
        listeners.addElement(alarmListener);
    }

    public void soarAlarme() {
    	
    	// for( ponto de partida ; ponto parada; passo) 
        for (Enumeration<EscutadorDeAlarme> e = listeners.elements(); e.hasMoreElements();  ) {
        
        	EscutadorDeAlarme escutador = (EscutadorDeAlarme) e.nextElement();
        	escutador.alarmar();
        	
        }
    }

}
