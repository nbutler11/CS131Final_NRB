
public abstract class Vehicle {
	private int gasMileage;
	private int speed;
	
	public Vehicle() {
		gasMileage = 0;
		speed = 0;
	}
	
	public Vehicle(int g, int s) {
		gasMileage = g;
		speed = s;
	}
	
	abstract public String model(String m);

	public int getGasMileage() {
		return gasMileage;
	}

	public void setGasMileage(int gasMileage) {
		this.gasMileage = gasMileage;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
