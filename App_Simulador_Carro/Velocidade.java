package simuladorcorrida;

import java.util.Random;

class Veiculo {
    private int velocidade;
    private int distancia;
    
    public Veiculo() {
        reiniciar();
    }

    public void reiniciar() {
	this.velocidade = 0;
	this.distancia = 0;
    }

    public int simularVelocidade() {
        Random rand = new Random();
        return rand.nextInt(3) + 1;
    }

    public void simularPasso() {
        this.velocidade = simularVelocidade();
        this.distancia += this.velocidade;
    }

    public String representar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < distancia; i++) {
            sb.append("-");
        }
        sb.append("V");
        return sb.toString();
    }

    public boolean alcancaDistanciaMaxima(int distanciaMaxima) {
        return this.distancia >= distanciaMaxima;
    }
}
