package exer_inter;

public class Aliemntacao implements Tributos{

	@Override
	public double calcularImposto(double valor) {
		return valor * 0.01;
	}
}
