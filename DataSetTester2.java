
public class DataSetTester2{
	public static void main(String[] args) {
		Measurer m = new PersonMeasurer();
		DataSet data = new DataSet(m);

		data.add(new Person("Jake", 175));
		data.add(new Person("Amari", 165));
		data.add(new Person("Brandon", 180));
		data.add(new Person("Kelly", 150));
		
		Person max = (Person) data.getMaximum();
		Person min = (Person) data.getMinimum();
		double avg = data.getAverage();
		System.out.println("The tallest person in " + max.getName() + ", with: " + max.getHeight());
		System.out.println("The shortest person is " + min.getName() +", with: " + min.getHeight());
		System.out.println("The average height is: " +  avg);
		
		
	}
}