package comJava;

//dog class based on the pet class
public class Dog extends Pet {
	// attributes for dog class
	private int dogSpaceNbr;
	private float dogWeight;
	private boolean grooming;
	
	public Dog(String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue, int dogSpaceNbr, float dogWeight, boolean grooming) {
	//call super class Pet constructor	
	super(petName, petAge, dogSpace, catSpace, daysStay, amountDue);
	//set values  to this class variables
	this.dogSpaceNbr = dogSpaceNbr;
	this.dogWeight = dogWeight;
	this.grooming = grooming;
	
	}
	//get dogSpaceNbr
	public int getDogSpaceNbr() {
		return dogSpaceNbr;
	}
	//set dogSpaceNbr
	public void setDogSpaceNbr(int dogSpaceNbr) {
		this.dogSpaceNbr = dogSpaceNbr;
	}
	//get dogWeight
	public float getDogWeight() {
		return dogWeight;
	}
	//set dogWeight
	public void setDogWeight(float dogWeight) {
		this.dogWeight = dogWeight;
	}
	//get grooming
	public boolean isGrooming() {
		return grooming;
	}
	//set grooming
	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
	}
	
}
