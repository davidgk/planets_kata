package com.dgkkatas.planets;

import com.dgkkatas.planets.utils.Direccion;
import com.dgkkatas.planets.utils.PlanetsConstants;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigDecimal;

/**
 * Created by davidgk on 22/06/16.
 */
public class Position {
	public Double initDay = null;
	public Double avancePerday = null;


	public static Position buildInitialPosition() {
		
		Position position = new Position();
		position.initDay = 0D;
		return position;
	}

	public void calculateAvance(Direccion direccion, Double velocityRadians) {
		this.avancePerday =this.initDay + ((direccion.equals(Direccion.RIGHT))? velocityRadians :(-1)*velocityRadians);
	}

}
