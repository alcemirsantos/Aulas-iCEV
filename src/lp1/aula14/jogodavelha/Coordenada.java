package lp1.aula14.jogodavelha;

public class Coordenada {
	
	private int x;
	private int y;
	
	
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		Coordenada c = null;
		if(o instanceof Coordenada)
			 c = (Coordenada) o;
		else 
			return false;
		if(this.getX() == c.getX() && this.getY() == c.getY())
			return true;
		return false;
	}

}
