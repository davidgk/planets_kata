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

	public static UniversalDate buildUniversalDateByDay(int day) {
		Double relativeFullPosition = (new Double(day/365));
		int year = relativeFullPosition.intValue();
		int dayPosition =(int)Math.floor (relativeFullPosition - year)*365;
		return new UniversalDate(year, dayPosition);

	}

	public boolean isInitialTimes() {
		return this.day == 0 && this.year == 0;
	}
}
