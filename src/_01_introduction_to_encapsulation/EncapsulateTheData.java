package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	public int itemsReceived; //must not be negative. All negative arguments get set to 0.
	public float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	public String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	public Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public static void main(String[] args) {
		
	}
	
	
	public void setItemsReceived(int i) {
		if(i>=0) {
		itemsReceived = i;
	}
		else {
			itemsReceived = 0;
		}
	}
	public int getitemsReceived() {
		return itemsReceived;
	}
	
	
	public void setDegreesTurned(float i) {
		if(i>=0 && i<=360) {
			degreesTurned = i;
	}
		else if(i<0){
			degreesTurned = 0;
		}
		else {
			degreesTurned = 3600;
		}
	}
	public float getdegreesTurned() {
		return degreesTurned;
	}
	
	
	public void setNomenclature(String i) {
		if(i.equals(null)) {
		nomenclature = " ";
	}
		else {
			nomenclature = i;
		}
	}
	public String getNomenclature() {
		return nomenclature;
	}
	
	
	public void setMemberObj(Object i) {
		if(i instanceof String) {
			i = new Object();
			memberObj = i;
	}
		else {
			memberObj = i;
		}
	}
	public Object getMemberObj() {
		return memberObj;
	}
	
}
