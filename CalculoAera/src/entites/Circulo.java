package entites;

import entites.enums.Cores;

public class Circulo extends Calculo{

	private Double raio;
	
	public Circulo() {
		super();
	}
	
	
	
	public Circulo(Cores cores, Double raio) {
		super(cores);
		this.raio = raio;
	}



	public Double getRaio() {
		return raio;
	}



	public void setRaio(Double raio) {
		this.raio = raio;
	}



	@Override
	public double area() {
		
		return Math.PI * raio * raio;
	}

	
}
