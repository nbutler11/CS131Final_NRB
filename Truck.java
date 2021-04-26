
public class Truck extends Vehicle implements Locked{
	private int towPackage;
	private boolean locked = false;
	
	public Truck() {
		super();
		towPackage = 0;
	}
	
	public Truck(int gasMileage, int speed, int t) {
		super(gasMileage, speed);
		towPackage = t;
	}
	
	public String model(String m){
		String model = m;
		return model;
	}
	
	public void odometer() {
		double speed = 34;
		double time = 70;
		double distance = speed*time;
		System.out.println(distance);
	}
	
	public void odometer(double s, double t) {
		double speed = s;
		double time = t;
		double distance = speed * time;
		System.out.println(distance);
	}

	@Override
	public String toString() {
		return "Truck [towPackage=" + towPackage + ", locked=" + locked + ", GasMileage=" + getGasMileage()
				+ ", Speed=" + getSpeed() + "]";
	}

	public void lock(boolean l) {
		locked = l;
		System.out.println(locked);
	}

	public int getTowPackage() {
		return towPackage;
	}

	public void setTowPackage(int towPackage) {
		this.towPackage = towPackage;
	}
	
	
}
