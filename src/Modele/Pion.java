package Modele;

public class Pion {
	int x, y; // -1,-1 si le pion n'est pas sur le plateau, dans la reserve
	int type; // 1:explorateur 2:bete 3:bateau
	int chiffre; // [type=1 -> valeur de l'explorateur] [type=2 -> 1:serpent 2:requin 3:baleine]
	int couleur; // [type=1 -> 1:rouge 2:bleu 3:vert 4:jaune]
	
	public Pion(int typePar, int chiffrePar, int couleurPar, int xPar, int yPar) {
		if(typePar<1 || typePar>3)
			throw new IllegalArgumentException("type non valide");
		if((typePar==1 && (chiffrePar<1 || chiffrePar>6)) || (typePar==2 && (chiffrePar<1 || chiffrePar>3)))
			throw new IllegalArgumentException("chiffre non valide");
		if(typePar==1 && (couleurPar<1 || couleurPar>4))
			throw new IllegalArgumentException("couleur non valide");
		x = xPar;
		y = yPar;
		type = typePar;
		chiffre = chiffrePar;
		couleur = couleurPar;
	}
	
	public boolean compareTo(Pion pion) {
		if(type==pion.type && chiffre==pion.chiffre && couleur==pion.couleur)
			return true;
		return false;
	}
	
	public String toString() {
		return "("+type+";"+chiffre+";"+couleur+";"+x+";"+y+")";
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
	
	public int[] getCoordonnee() {
		int[] coordonnee = {x,y};
		return coordonnee;
	}

	public void setCoordonnee(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getChiffre() {
		return chiffre;
	}

	public void setChiffre(int chiffre) {
		this.chiffre = chiffre;
	}

	public int getCouleur() {
		return couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}
}
