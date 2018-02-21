
public class Person{
	public Person() {
		name = "";
		height = 0;
	}
	
	public Person(String aName, double aHeight) {
		name = aName;
		height = aHeight;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	
	private double height;
	private String name;
}
