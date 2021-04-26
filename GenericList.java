
public class GenericList <T>{
	private final int size=10;
	private int current=0;
	private T objList[];
	
	@SuppressWarnings("unchecked")
	public GenericList() {
		objList = (T[]) new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	public GenericList(int length) {
		objList = (T[]) new Object[length];
	}
	
	public void addItem(T item) {
		objList[current] = item;
		current++;
	}
	
	public T getItem(int item) {
		return objList[item];
	}

}
