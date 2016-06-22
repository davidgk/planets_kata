package com.dgkkatas.planets;

import com.dgkkatas.planets.utils.Direccion;
import com.dgkkatas.planets.utils.PlanetsConstants;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigDecimal;

/**
 * Created by davidgk on 22/06/16.
 */
public class Position {
	public Double sinusInitDay;
	public Double cosinusInitDay;
	public Double sinusEndDay;
	public Double cosinusEndDay;

	public static Position buildInitialPosition() {
		
		Position position = new Position();
		position.sinusInitDay = 0D;
		position.cosinusInitDay = 1D;
		return position;
	}

	public static Double getSinusValue(Integer velocity, boolean itsEndOfDay) {
			Double calculateValue = Math.sin(Math.toRadians(velocity.doubleValue()));
			return checkEndsDay(calculateValue, itsEndOfDay);

	}

	private static Double checkEndsDay(Double calculateValue, boolean itsEndOfDay) {
		return (itsEndOfDay)? (calculateValue - PlanetsConstants.ERROR_MARGIN):calculateValue;

	}

	public static Double getCosinusValue(Integer velocity, boolean itsEndOfDay) {
		Double calculateValue = Math.cos(Math.toRadians(velocity.doubleValue()));
		return checkEndsDay(calculateValue, itsEndOfDay);
	}


	public void calculateEndDay(Direccion direccion, Integer velocity) {
		boolean isEndOfDay = true;
		if (direccion.equals(Direccion.RIGHT))
			calculatePositionRight(velocity, isEndOfDay);
		else
			calculateLeftPosition(velocity, isEndOfDay);
	}

	private void calculatePositionRight(Integer velocity, boolean isEndOfDay) {
		this.sinusEndDay = Position.getSinusValue(velocity,isEndOfDay);
		this.cosinusEndDay = Position.getCosinusValue(velocity,isEndOfDay);
	}

	private void calculateLeftPosition(Integer velocity, boolean isEndOfDay) {
		throw new NotImplementedException();
	}
}
