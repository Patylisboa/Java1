package aula2;

public class Pontos {
	double x = 0.0;
	double y;
	
	public Pontos(double coordx, double coordy){
		this.x = coordx;
		this.y = coordy;
	}
	
	public Pontos(double coordx){
		x = coordx;
		y = 0;
	}
	
	
	
	public void deslocar(double deltax, double deltay){
		y += deltax;
		x += deltay;
	}
	
		
	}

