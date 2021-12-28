import java.util.Random;

public class Car implements Vehicle, GPS, Radio {
	String licensePlate = "6TRJ244";

	public void start() {
		System.out.println("Starting Engine...");
	}

	public void stop() {
		System.out.println("Stopping Engine...");
	}

	public void getCoordinates() {
		Random rd = new Random();
		float x, y;
		x = rd.nextFloat(100);
		y = rd.nextFloat(100);
		System.out.println("Car's current coordinate: " + x + ", " + y);
	}

	public void startRadio() {
		System.out.println("Start Radio...");
	}

	public void stopRadio() {
		System.out.println("Stop Radio...");
	}

	public static void main(String[] args) {
		Car tesla = new Car();
		tesla.start();
		System.out.println("Car Number Plate: " + tesla.licensePlate);
		tesla.blowHorn();
		tesla.getCoordinates();
		tesla.startRadio();
		tesla.stopRadio();
		tesla.stop();
	}
}