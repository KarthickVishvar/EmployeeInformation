package com.employee.details;

public class RailwayStations extends CourseDetails	{
	
	@Override
	public void furniture() {
		System.out.println("10");
	}
	@Override
	public void employee() {
		System.out.println("25");
	}
	@Override
	public void quantity() {
		System.out.println("high");
	}
	
	public static void main(String[] args) {
		RailwayStations r = new RailwayStations();
		r.logoAndTheme();
		r.furniture();
		r.employee();
		r.quantity();
	}
}