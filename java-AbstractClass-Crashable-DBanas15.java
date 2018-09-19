public abstract class Crashable {
// Crashable is an Abstract Class. Create an Abstract Class whenever you want to create a 
// class in which not every method has to be implemented to use the Abstract Class

	boolean carDrivable = true;

	public void youCrashed() {
		this.carDrivable = false;
	}

	public abstract void setCarStrength(int carStrength);
	public abstract int getCarStrength();
}
