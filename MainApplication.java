import java.util.Scanner;
import java.io.*;

public class MainApplication {

	public static void main(String[] args) throws FileNotFoundException{
		RangeException negative = new RangeException("You cannot have a negative value here");
		Scanner input;
		
		try{
			Car myCar = new Car();
			Car car2 = new Car(-25,85,5,120);
			
			Truck myTruck = new Truck();
			Truck truck2 = new Truck(-18,90,10000);
			truck2.model("Ford F-150");
			
			Vehicle volkswagen;
			volkswagen = new Truck(35,100,7000);
			volkswagen.model("Volkswagen S-20");
			
			Vehicle audi;
			audi = new Car(23,120,2,60);
			audi.model("Audi A720");
			
			Locked auto;
			auto = new Car();
			auto.lock(true);
			
			if(truck2.getGasMileage()<0) throw negative;
			if(car2.getGasMileage()<0) throw negative;
			
			GenericList<Car> carList = new GenericList<Car>();
			GenericList<Truck> truckList = new GenericList<Truck>(5);
			GenericList<String> stringList = new GenericList<String>();
			
			File file = new File("FinalText");
			input = new Scanner(file);
			while(input.hasNextLine()) {
				String data = input.nextLine();
				stringList.addItem(data);
			}
			
			carList.addItem(myCar);
			carList.addItem(car2);
			truckList.addItem(myTruck);
			truckList.addItem(truck2);
			
			GenericMethod meth = new GenericMethod();
			meth.printDetails(myCar);
			meth.printDetails(truck2);
			
			System.out.println();
			System.out.println(stringList.getItem(3));
			System.out.println(stringList.getItem(2));
			
		}
		
		catch(RangeException r) {
			System.out.println(r.getMessage());
		}
		/*catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}*/

	}//end main

}//end class
