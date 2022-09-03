
public class Vehicles {

	public static void main(String[] args) {
		Vehicles Vehicles = new Vehicles();     //1. creating object
		//Vehicles.truckDrive();               // 3.calling object like this
		//Vehicles.carDrives();
     System.out.println("truckDrives");        // directly your can call your object
     System.out.println("carDrives");
	}

	public void truckDrive() {                 // 2. creating void sentence method(){}
	System.out.println("truck Drives at speed");
	}	
    public void carDrives() {
    	System.out.println("car Drives fastre than truck");
    }


}
