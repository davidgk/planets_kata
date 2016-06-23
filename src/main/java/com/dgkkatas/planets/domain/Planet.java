package com.dgkkatas.planets.domain;

import com.dgkkatas.planets.Position;
import com.dgkkatas.planets.utils.Direccion;
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
	public Position lastPosition ;


	public Planet(Integer velocityGrades, Integer distanceToSun, Direccion direccion, String name){
		this.velocityRadians = getVelocityByRadians(velocityGrades);
		this.distance2Sun = distanceToSun;
		this.direccion = direccion;
		this.name = name;
		currentPosition =  Position.buildInitialPosition();

	}

	protected  Double getVelocityByRadians(Integer velocity){
		return  (double) Math.round((velocity * (3.141592/180)) * 1000d)/ 1000d;
	}

	public void calculatePosition(int day) {
		currentDate= UniversalDate.buildUniversalDateByDay(day);
		currentPosition.calculateAvance(direccion,velocityRadians);
		if(currentDate.isInitialTimes()) {
			if (lastPosition == null) {
				lastPosition = new Position();

			}
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