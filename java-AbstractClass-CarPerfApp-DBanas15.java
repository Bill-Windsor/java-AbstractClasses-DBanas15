public class CarPerfApp {
// Define a class to use an interface with the implements keyword. 
// This class must create a method for each method defined in Drivable.

	public static void main(String[] args) {
		 Vehicle car = new Vehicle(4, 100.0);

// Using methods from the interface Drivable
	System.out.println("Cars - Max Speed: " + car.getSpeed());
	System.out.println("Cars - Number of Wheels: " + car.getWheels());

// Using methods from abstract method Crashable
	car.setCarStrength(10);
	System.out.println("Car Strength: " + car.getCarStrength());
	}
}
