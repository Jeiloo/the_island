package Modele;

public class De {
	int chiffre; // 1:serpent 2:requin 3:baleine
	
	public De() {
		chiffre=1;
	}
	
	public int lancer() {
		chiffre = (int)(Math.random()*(3-1));
		return chiffre;
	}
}
