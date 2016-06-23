package com.dgkkatas.planets.utils;

/**
 * Created by davidgk on 22/06/16.
 */
public class UniversalDate {
	public final int year;
	public final int day;

	public UniversalDate(int year, int dayPosition) {
		this.year = year;
		this.day = dayPosition;
	}

	public static UniversalDate buildUniversalDateByDay(Integer day) {
		Double relativeFullPosition = (double)(day.doubleValue()/365);
		int year = relativeFullPosition.intValue();
		int dayPosition =Double.valueOf(((double)(relativeFullPosition)-year)*365).intValue();
		return new UniversalDate(year, dayPosition);

	}

	public boolean isInitialTimes() {
		return this.day == 0 && this.year == 0;
	}
}
