
public class GenericMethod {
	public <E> void printDetails(E vehicle) {
		String printed = vehicle.toString();
			System.out.println(printed);
	}
	
}
