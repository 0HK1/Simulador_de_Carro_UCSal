package simuladorcorrida;

public class SimuladorCorrida {
	private static final int DISTANCIA_MAXIMA = 50;
	
	public static void main (String[] args) {
		Veiculo veiculo1 = new Veiculo();
		Veiculo veiculo2 = new Veiculo();
		
		while(!veiculo1.alcancaDistanciaMaxima(DISTANCIA_MAXIMA) && !veiculo2.alcancaDistanciaMaxima(DISTANCIA_MAXIMA)) {
			veiculo1.simularPasso();
			veiculo2.simularPasso();

			System.out.println("//////////////////////////////////////////////////////////////////////");
			System.out.println("Veículo 1: " + veiculo1.representar());
			System.out.println("Veículo 2: " + veiculo2.representar());
			System.out.println("//////////////////////////////////////////////////////////////////////");
			System.out.println();
		}
		
		if (veiculo1.alcancaDistanciaMaxima(DISTANCIA_MAXIMA) && veiculo2.alcancaDistanciaMaxima(DISTANCIA_MAXIMA)) {
			System.out.println("Empate!");
		}else if (veiculo1.alcancaDistanciaMaxima(DISTANCIA_MAXIMA)) {
			System.out.println("Veículo 1 venceu!");
		}else {
			System.out.println("Veículo 2 venceu!");
		}
		
	}

}
