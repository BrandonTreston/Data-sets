
public class DataSet {
	public DataSet(Measurer aMeasurer) {
		sum = 0;
		count  = 0;
		maximum = null;
		minimum = null;
		measurer = aMeasurer;
	}
	
	public void add(Object x) {
		sum = sum + measurer.measure(x);
		if (count == 0 || measurer.measure(maximum) < measurer.measure(x)) {
			maximum = x;
		}
		if (count == 0 || measurer.measure(minimum)  < measurer.measure(x)) {
			minimum = x;
			count ++;
		}
		else count ++;
		}
	
		
	
		
	public double getAverage() {
		if (count == 0 ) 
			return 0;
		else 
			return (sum/count);
	}
	
	public Object getMaximum() {
		return maximum;
	}
	
	public Object getMinimum() {
		return minimum;
	}
	
	private double sum;
	private int count;
	private Object maximum;
	private Object minimum;
	private Measurer measurer;
}
