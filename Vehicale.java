public class Vehicale {
	
	
	public static void main(String[] args) {
		System.out.print("Hello");
		
		PetrolEngine pE = new PetrolEngine();
		pE.start();
		
		ElectricEngine eE = new ElectricEngine();
		eE.start();
		
		HydrogenEngine hE = new HydrogenEngine();
		hE.start();
		hE.stop();
	
	}
}