import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		String literate = "Count:";
		Counter counter = new Counter();
		
		System.out.println(literate + counter.getCount());
		
		counter.increment();
		
		System.out.println(literate + counter.getCount());
		
		counter.decrement();
		
		System.out.println(literate + counter.getCount());
		
	}

}
