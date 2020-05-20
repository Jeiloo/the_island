package Modele;

public class Case { // une case du plateau (hexagone)
	int x, y; // coordonnee de la case
	int type; // 1:plage 2:mer 3:mer profonde
	
	public Case(int xPar, int yPar, int typePar) {
		if(typePar<1 || typePar>3)
			throw new IllegalArgumentException("type non valide");
		x = xPar;
		y = yPar;
		type = typePar;
	}

	public String toString() {
		return "("+type+";"+x+";"+y+")";
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
