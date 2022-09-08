package practice_q6;

import java.util.HashMap;

public class CarFactory {
	
	private static CarFactory carInstance = new CarFactory();
	private HashMap<String, Car> carMap = new HashMap<String, Car>();
	
	public CarFactory() {}
	
	public static CarFactory getInstance(){
		
		if(carInstance == null) {
			carInstance = new CarFactory();
		}

		return carInstance;
	}
	
	public Car createCar(String name) {
		
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}
		
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
}
