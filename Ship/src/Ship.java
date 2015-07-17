/**
 * Simple class to represent a Ship
 * @author marcos cesar
 * 29-06-2015
 *
 */

public class Ship {
	//State
	private int propulsion = 1;
	String name;
	String manufactory;
	
	//Behavior
	public int getPropulsion(){
		return this.propulsion;
	}
	
	public void setPropulsion(int newPropulsion) {
		
		this.propulsion = newPropulsion;
	}
	
	public String getName(){
		return this.name;		
	}
	
	public void setName( String newName){
		this.name = newName;
	}
	
	public String getManufactory(){
		return this.manufactory;	
}
	public void setManufactory(String newManufactory){
		this.manufactory = newManufactory;
	}
	
}