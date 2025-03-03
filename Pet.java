package pet.java;

public class Pet {
	//attributes with corresponding data types
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	
	//constructor for specified attributes
	public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.daysStay = daysStay;
	}
	//get petType
	public String getPetType() {
		return petType;
	}
	//set petType
	public void setPetType(String petType) {
		this.petType = petType;
	}
	//get petName
	public String getPetName() {
		return petName;
	}
	//set petName
	public void setPetName(String petName) {
		this.petName = petName;
	}
	//get petAge
	public int getPetAge() {
		return petAge;
	}
	//set petAge
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	//get dogSpaces
	public int getDogSpaces() {
		return dogSpaces;
	}
	//set dogSpaces
	public void setDogSpaces(int dogSpaces) {
		this.dogSpaces = dogSpaces;
	}
	//get catSpaces
	public int getCatSpaces() {
		return catSpaces;
	}
	//set catSpaces
	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
	}
	//get daysStay
	public int getDaysStay() {
		return daysStay;
	}
	//set daysStay
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	//get amountDue
	public double getAmountDue() {
		return amountDue;
	}
	//set amountDue
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
