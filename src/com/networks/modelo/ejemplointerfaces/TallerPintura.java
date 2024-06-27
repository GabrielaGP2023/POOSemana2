package com.networks.modelo.ejemplointerfaces;


public class TallerPintura implements ITaller {

	@Override
	public String reparar(Coche c) {
		// TODO Auto-generated method stub
		return "El coche con la matricula " + c.getMatricula() + " se est� pintando";
	}

	public TallerPintura() {
	}
}
