package lambdas;

public class Produto extends Object {

	final String NOME;
	final double PRECO;
	final double DESCONTO;
	
	public Produto(String nOME, double pRECO, double dESCONTO) {
		NOME = nOME;
		PRECO = pRECO;
		DESCONTO = dESCONTO;
	}
	
	public String toString() {
		double precoFinal = PRECO * (1 - DESCONTO);
		return NOME + " Tem preco de R$" + String.format("%.2f", precoFinal);
	}
}