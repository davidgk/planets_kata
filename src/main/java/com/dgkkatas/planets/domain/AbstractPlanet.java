package com.dgkkatas.planets.domain;

import com.dgkkatas.planets.Position;
import com.dgkkatas.planets.utils.Direccion;

/**
 * Created by davidgk on 22/06/16.
 */
public abstract class AbstractPlanet {

	private final Integer distance2Sun;
	private final Integer velocity;
	private final Direccion direccion ;

	public Position position;
	public final Position initialPosition = Position.buildInitialPosition();


	public AbstractPlanet(Integer velocity, Integer distanceToSun, Direccion direccion){
		this.velocity = velocity;
		this.distance2Sun = distanceToSun;
		this.direccion = direccion;
	}

	public abstract void calculatePosition(int day );

	public Integer getDistance2Sun(){
		return distance2Sun;
	}
	public Integer getVelocity(){
		return velocity;
	}

	public Direccion getDireccion(){
		return this.direccion;

	}
}