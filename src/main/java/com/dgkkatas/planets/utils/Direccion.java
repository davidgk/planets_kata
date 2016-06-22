package com.dgkkatas.planets.utils;

/**
 * Created by davidgk on 22/06/16.
 */
public enum Direccion {

	LEFT(-1), RIGHT(1);

	public int sentido;


	Direccion(int sent) {
		this.sentido = sent;
	}



}
