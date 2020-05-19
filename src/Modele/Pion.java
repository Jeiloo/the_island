package Modele;

import java.awt.Color;

public class Pion {
	int x, y;
	int type; // 1:explorateur 2:bete 3:bateau
	int chiffre; // [type=1 -> valeur de l'explorateur] [type=2 -> 1:serpent 2:requin 3:baleine]
	int couleur; // [type=1 -> 1:rouge 2:bleu 3:vert 4:jaune]
	Color couleurRVB;
	
	public Pion(int typePar, int chiffrePar, int couleurPar, int xPar, int yPar) {
		if(typePar<1 || typePar>3)
			throw new IllegalArgumentException("type non valide");
		if((typePar==1 && (chiffrePar<1 || chiffrePar>6)) || (typePar==2 && (chiffrePar<1 || chiffrePar>3)))
			throw new IllegalArgumentException("chiffre non valide");
		if(typePar==1 && (couleurPar<1 || couleurPar>4))
			throw new IllegalArgumentException("couleur non valide");
		x=xPar; y=yPar;
		type=typePar;
		chiffre=chiffrePar;
		couleur=couleurPar;
		switch(couleur) {
		case 1:
			couleurRVB = new Color(255,0,0);
			break;
		case 2:
			couleurRVB = new Color(0,255,0);
			break;
		case 3:
			couleurRVB = new Color(0,0,255);
			break;
		case 4:
			couleurRVB = new Color(255,255,0);
			break;
		}
	}
}
