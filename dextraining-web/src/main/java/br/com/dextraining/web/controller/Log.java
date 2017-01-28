package br.com.dextraining.web.controller;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class Log implements PhaseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Finalizando a fase: "+ event.getPhaseId().getName());
		
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Inicializando a fase: "+ event.getPhaseId().getName());
		
	}

	@Override
	public PhaseId getPhaseId() {
		
		return PhaseId.ANY_PHASE;
	}

}
