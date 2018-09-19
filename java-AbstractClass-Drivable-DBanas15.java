public interface Drivable {
	double PI = 3.1415926536

// All methods in an interface must be implemented. 
// These methods are 'public abstract' by default.
// An abstract class must be defined by any class that uses the interface. 

int getWheels();

void setWheels(int numWheels);

double getSpeed();

void setSpeed(double speed);

}
