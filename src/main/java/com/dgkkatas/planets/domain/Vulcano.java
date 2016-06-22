package com.dgkkatas.planets.domain;

import com.dgkkatas.planets.Position;
import com.dgkkatas.planets.utils.Direccion;
import com.dgkkatas.planets.utils.PlanetsConstants;
import com.dgkkatas.planets.utils.UniversalDate;
import sun.security.pkcs11.wrapper.Constants;

/**
 * Created by davidgk on 22/06/16.
 */
public class Vulcano extends AbstractPlanet{


	public Vulcano(Integer velocity, Integer distanceToSun, Direccion direccion) {
		super(velocity, distanceToSun, direccion);
	}

	public void calculatePosition(int day) {
		UniversalDate currentDate = UniversalDate.buildUniversalDateByDay(day);
		if (day == PlanetsConstants.INITIAL_TIMES){
			this.position = initialPosition;
			this.position.calculateEndDay(this.getDireccion(),this.getVelocity());


		}
	}


}
