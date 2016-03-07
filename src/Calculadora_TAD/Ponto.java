package Calculadora_TAD;

public class Ponto implements IPonto {

	protected int valor1;
	protected int valor2;
	
	public Ponto(int valor1, int valor2) {
		this.setValor1(valor1);
		this.setValor2(valor2);
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	
	public int somar() {
		return this.getValor1() + this.getValor2();
	}
	
	public int subtrair() {
		return this.getValor1() - this.getValor2();
	}
	
	public int multiplicar() {
		return this.getValor1() * this.getValor2();
	}
	
	public double dividir() {
		return this.getValor1() / this.getValor2();
	}
	
}