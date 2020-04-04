package classe;

public class AreaCirc {

	double raio;
	double pi;
	
	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
	
}
