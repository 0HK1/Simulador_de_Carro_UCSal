package simuladorcorrida;

import java.util.Random;

public class Veiculo {
	private int velocidade;
    private int distancia;
    
    public Veiculo() {
        this.velocidade = 0;
        this.distancia = 0;

    }
    
    public int getDistancia() {
    	return distancia;
    }
    
    public void simularPasso() {
        Random rand = new Random();
        this.velocidade = rand.nextInt(3) + 1;
        this.distancia += this.velocidade;
    }
    
    public String representar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < distancia; i++) {
            sb.append(" ");
        }
        sb.append("V");
        return sb.toString();
    }
}

