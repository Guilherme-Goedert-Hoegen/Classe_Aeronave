
public class classeaeronave {

	public static void main(String[] args) {
		Aeronave aero1 = new Aeronave(50, 2000, 3000, 5);
		

		Aeronave aero2 = new Aeronave(70, 2000, 3000, 8);
		

		Aeronave aero3 = new Aeronave(40, 1500, 2000, 8);
		

		Aeronave aero4 = new Aeronave(55, 2500, 2500, 7);
		

		double autonimiaAero1 = aero1.capacidadeDeCombustivel / aero1.queimaDeCombustivelmin;
		double autonimiaAero2 = aero2.capacidadeDeCombustivel / aero2.queimaDeCombustivelmin;
		double autonimiaAero3 = aero3.capacidadeDeCombustivel / aero3.queimaDeCombustivelmin;
		double autonimiaAero4 = aero4.capacidadeDeCombustivel / aero4.queimaDeCombustivelmin;
		
		double distanciaAero1 = aero1.velociadadeMaxima * autonimiaAero1;
		double distanciaAero2 = aero2.velociadadeMaxima * autonimiaAero2;
		double distanciaAero3 = aero3.velociadadeMaxima * autonimiaAero3;
		double distanciaAero4 = aero4.velociadadeMaxima * autonimiaAero4;
		

		if (autonimiaAero1 > autonimiaAero2 && autonimiaAero1 > autonimiaAero3 && autonimiaAero1 > autonimiaAero4) {
			System.out.println("A aeronave 1 fica mais tempo no ar");
		}

		else if (autonimiaAero2 > autonimiaAero1 && autonimiaAero2 > autonimiaAero3 && autonimiaAero2 > autonimiaAero4) {
			System.out.println("A aeronave 2 fica mais tempo no ar");

		} 
		else if (autonimiaAero3 > autonimiaAero2 && autonimiaAero3 > autonimiaAero1 && autonimiaAero3 > autonimiaAero4) {
			System.out.println("A aeronave 3 fica mais tempo no ar");
		}
		else {
			System.out.println("A aeronave 4 fica mais tempo no ar");
		}
		if (aero1.getPassageiros() > aero2.getPassageiros() && aero1.getPassageiros() > aero3.getPassageiros() && aero1.getPassageiros() > aero4.getPassageiros()) {
			System.out.println("Aerona 1 carrega mais passageiros: " + aero1.getPassageiros() + " passageiros");
		}
		
		else if (aero2.getPassageiros() > aero1.getPassageiros() && aero2.getPassageiros() > aero3.getPassageiros() && aero2.getPassageiros() > aero4.getPassageiros()) {
			System.out.println("Aerona 2 carrega mais passageiros: " + aero2.getPassageiros() + " passageiros");
		}
		else if (aero3.getPassageiros() > aero2.getPassageiros() && aero3.getPassageiros() > aero1.getPassageiros() && aero3.getPassageiros() > aero4.getPassageiros()) {
			System.out.println("Aerona 3 carrega mais passageiros: " + aero3.getPassageiros() + " passageiros");
		}
		else {
			System.out.println("Aerona 4 carrega mais passageiros: " + aero4.getPassageiros() + " passageiros");
		}
		if (distanciaAero1 > distanciaAero2 && distanciaAero1 > distanciaAero3 && distanciaAero1 > distanciaAero4) {
			System.out.println("Aeronave 1 voa mais longe");
		}

		else if (distanciaAero2 > distanciaAero1 && distanciaAero2 > distanciaAero3 && distanciaAero2 > distanciaAero4) {
			System.out.println("Aeronave 2 voa mais longe");
		} 
		else if (distanciaAero3 > distanciaAero1 && distanciaAero3 > distanciaAero2 && distanciaAero3 > distanciaAero4) {
			System.out.println("Aeronave 3 voa mais longe");	
			}
		else {
			System.out.println("Aeronave 4 voa mais longe");	
			} 
	}

}
