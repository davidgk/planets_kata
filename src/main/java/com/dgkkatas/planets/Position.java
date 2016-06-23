package com.dgkkatas.planets;

import com.dgkkatas.planets.utils.Direccion;
import com.dgkkatas.planets.utils.MathCalculations;
import com.dgkkatas.planets.utils.PlanetsConstants;

/**
 * Created by davidgk on 22/06/16.
 */
public class Position {
	public Double currentPosition = null;


	public void advancePerDay(Integer amountDays, Direccion direccion, Double velocityRadians) {
		Double advance = (amountDays == null || amountDays == 0)?0D:amountDays*velocityRadians;
		if(direccion.equals(Direccion.RIGHT)){
			currentPosition = MathCalculations.round(advance +  velocityRadians ,3);
		}else{
			currentPosition = MathCalculations.round(PlanetsConstants.TWO_PI - advance - velocityRadians,3);
		}
		if(this.currentPosition >= PlanetsConstants.TWO_PI){
			currentPosition = currentPosition -PlanetsConstants.TWO_PI;
		}
	}
}
