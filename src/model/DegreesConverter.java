package model;

public class DegreesConverter {
	enum Degree {
		FAHRENHEIT, CELSIUS
	}
	private Degree convertTo;
	private double degreeAmount;
	private double conversionAmount;
	private String finalMeasurement;
	
	public DegreesConverter() {
		super();
	}

	public DegreesConverter(String startingMeasurement, double degreeAmount) {
		super();
		this.convertTo = Degree.valueOf(startingMeasurement);
		this.degreeAmount = degreeAmount;
		calculate();
	}

	public Degree getStartingMeasurement() {
		return convertTo;
	}

	public void setStartingMeasurement(Degree startingMeasurement) {
		this.convertTo = startingMeasurement;
	}

	public double getDegreeAmount() {
		return degreeAmount;
	}

	public void setDegreeAmount(double degreeAmount) {
		this.degreeAmount = degreeAmount;
	}
	
	public double getConversionAmount() {
		return conversionAmount;
	}

	public void setConversionAmount(double conversionAmount) {
		this.conversionAmount = conversionAmount;
	}
	
	public String getFinalMeasurement() {
		return finalMeasurement;
	}
	
	private void calculate() {
		switch (convertTo) {
			case FAHRENHEIT:
				conversionAmount = degreeAmount * 9/5 + 32;
				finalMeasurement = "Fahrenhiet";
				break;
				//°C  x  9/5 + 32 = °F
			case CELSIUS:
				conversionAmount = (degreeAmount - 32) * 5/9;
				finalMeasurement = "Celsius";
				break;
				//(°F  -  32)  x  5/9 = °C
		}
		conversionAmount = Math.round(conversionAmount * 100.0) / 100.0;
	}
	
	

}
