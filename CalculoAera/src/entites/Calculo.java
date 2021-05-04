package entites;

import entites.enums.Cores;

public abstract class Calculo {

	private Cores cores;

	public Calculo() {
	
	}
	
	
	public Calculo(Cores cores) {
		this.cores = cores;
	}


	public Cores getCores() {
		return cores;
	}

	public void setCores(Cores cores) {
		this.cores = cores;
	}
	public abstract double area();
		
	}

