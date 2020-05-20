package Modele;

public class Tuile {
	int x, y; // -1,-1 si la tuile n'est pas sur le plateau
	int recto; // 1:plage 2:foret 3:montagne
	int verso; // 1:requin 2:baleine 3:bateau 4:tourbillon 5:volcan 6:dauphin 7:serpent
	int type; // 1:immediate(vert) 2:debut(rouge) 3:dehors(defense rouge)
	
	public Tuile(int rectoPar, int versoPar, int typePar, int xPar, int yPar) {
		if(rectoPar<1 || rectoPar>3)
			throw new IllegalArgumentException("recto non valide");
		if(versoPar<1 || versoPar>8)
			throw new IllegalArgumentException("verso non valide");
		if(typePar<1 || typePar>3)
			throw new IllegalArgumentException("type non valide");
		x = xPar;
		y = yPar;
		recto = rectoPar;
		verso = versoPar;
		type = typePar;
	}
	
	public boolean compareTo(Tuile tuile) {
		if(recto==tuile.recto && verso==tuile.verso && type==tuile.type)
			return true;
		return false;
	}
	
	public String toString() {
		return "("+recto+";"+verso+";"+type+";"+x+";"+y+")";
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

	public int getRecto() {
		return recto;
	}

	public void setRecto(int recto) {
		this.recto = recto;
	}

	public int getVerso() {
		return verso;
	}

	public void setVerso(int verso) {
		this.verso = verso;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
