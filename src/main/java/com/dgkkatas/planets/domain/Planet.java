package com.dgkkatas.planets.domain;

import com.dgkkatas.planets.Position;
import com.dgkkatas.planets.utils.Direccion;
import com.dgkkatas.planets.utils.MathCalculations;
import com.dgkkatas.planets.utils.PlanetsConstants;
import com.dgkkatas.planets.utils.UniversalDate;

/**
 * Created by davidgk on 22/06/16.
 */
public class Planet {

	private final Integer distance2Sun;
	private final Double velocityRadians;
	private final Direccion direccion ;
	private final String name;
	public UniversalDate currentDate;

	public Position currentPosition;


	public Planet(Integer velocityGrades, Integer distanceToSun, Direccion direccion, String name){
		this.velocityRadians = getVelocityByRadians(velocityGrades);
		this.distance2Sun = distanceToSun;
		this.direccion = direccion;
		this.name = name;
		currentPosition =  new Position();

	}

	protected  Double getVelocityByRadians(Integer velocity){
		return MathCalculations.round((double) (velocity * (PlanetsConstants.PI / 180)) ,3);
	}

	public void calculatePosition(int day) {
		currentDate= UniversalDate.buildUniversalDateByDay(day);
		calculateAvance(direccion, velocityRadians);
	}

	public void calculateAvance(Direccion direccion, Double velocityRadians) {
		if (currentDate.day == 0 ){
			currentPosition.advancePerDay(0 , direccion, velocityRadians);
		}else{
			currentPosition.advancePerDay(currentDate.day, direccion, velocityRadians);
		}
	}






	public Integer getDistance2Sun(){
		return distance2Sun;
	}
	public Double getVelocityRadians(){
		return velocityRadians;
	}
	public Direccion getDireccion(){		return this.direccion;	}
}