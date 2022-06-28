
public class Aeronave {
	
	int passageiros;
	int velociadadeMaxima;
	int capacidadeDeCombustivel;
	int queimaDeCombustivelmin;
	
	public double tempoNoAr() {
	return capacidadeDeCombustivel/queimaDeCombustivelmin;
	
}

	public Aeronave(int passageiros, int velociadadeMaxima, int capacidadeDeCombustivel, int queimaDeCombustivelmin) {

		this.passageiros = passageiros;
		this.velociadadeMaxima = velociadadeMaxima;
		this.capacidadeDeCombustivel = capacidadeDeCombustivel;
		this.queimaDeCombustivelmin = queimaDeCombustivelmin;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getVelociadadeMaxima() {
		return velociadadeMaxima;
	}

	public void setVelociadadeMaxima(int velociadadeMaxima) {
		this.velociadadeMaxima = velociadadeMaxima;
	}

	public int getCapacidadeDeCombustivel() {
		return capacidadeDeCombustivel;
	}

	public void setCapacidadeDeCombustivel(int capacidadeDeCombustivel) {
		this.capacidadeDeCombustivel = capacidadeDeCombustivel;
	}

	public int getQueimaDeCombustivelmin() {
		return queimaDeCombustivelmin;
	}

	public void setQueimaDeCombustivelmin(int queimaDeCombustivelmin) {
		this.queimaDeCombustivelmin = queimaDeCombustivelmin;
	}



}