package com.dgkkatas.planets.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by davidgk on 23/06/16.
 */
public class MathCalculations {

	public static Double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
