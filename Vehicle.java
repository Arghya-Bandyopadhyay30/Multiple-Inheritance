public interface Vehicle {
	public String licensePlate = "";
	public void start();
	public void stop();
	default void blowHorn() {
		System.out.println("Blowing Horn...");
	}
}