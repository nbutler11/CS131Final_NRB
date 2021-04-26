
public class Car extends Vehicle implements Locked{
	private int capacity;
	private int trunkSpace;
	private boolean hatchback;
	private boolean locked = false;
	
	public Car() {
		super();
		capacity = 0;
		trunkSpace = 0;
		hatchback = false;
	}
	
	public Car(int g, int s, int c, int trunk) {
		super(g,s);
		capacity = c;
		trunkSpace = trunk;
		hatchback = false;
	}
	
	public String model(String m){
		String model = m;
		return model;
	}
	
	public void lock(boolean l) {
		locked = l;
		System.out.println(locked);
	}

	@Override
	public String toString() {
		return "Car [capacity=" + capacity + ", trunkSpace=" + trunkSpace + ", hatchback=" + hatchback + ", locked="
				+ locked + ", getGasMileage=" + getGasMileage() + ", Speed=" + getSpeed() + "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getTrunkSpace() {
		return trunkSpace;
	}

	public void setTrunkSpace(int trunkSpace) {
		this.trunkSpace = trunkSpace;
	}

	public boolean isHatchback() {
		return hatchback;
	}

	public void setHatchback(boolean hatchback) {
		this.hatchback = hatchback;
	}
	
}
