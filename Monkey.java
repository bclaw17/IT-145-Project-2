package graziosoSalvare;

public class Monkey extends RescueAnimal {
	
	private String species;
	private int height;
	private int tailLength;
	private int bodyLength;	
	private int measurementTorso;
	private int measurementSkull;
	private int measurementNeck;
	
	
	//Accessor Methods
	
	public String getSpecies() {
		return species;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getTailLength() {
		return tailLength;
	}
	
	public int getBodyLength() {
		return bodyLength;
	}
	
	public int getMeasurementTorso() {
		return measurementTorso;
	}
	
	public int getMeasurementSkull() {
		return measurementSkull;
	}
	
	public int getMeasurementNeck() {
		return measurementNeck;
	}
	
	
	//Mutator Methods
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}
	
	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public void setMeasurementTorso(int measurementTorso) {
		this.measurementTorso = measurementTorso;
	}
	
	public void setMeasurementSkull(int measurementSkull) {
		this.measurementSkull = measurementSkull;
	}
	
	public void setMeasurementNeck(int measurementNeck) {
		this.measurementNeck = measurementNeck;
	}
	
	
	
	

}
