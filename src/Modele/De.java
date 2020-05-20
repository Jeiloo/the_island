package Modele;

public class De { // classe represantant un de, appelle le de de creature
	int chiffre; // 1:serpent 2:requin 3:baleine, la valeur du dernier lance reste enregistree
	
	public De() {
		chiffre = 0; // 0 de base, jamais lance
	}
	
	public int lancer() { // genere un nombre random entre 1,2 et 3 ( 1:serpent 2:requin 3:baleine )
		chiffre = 1 + (int)(Math.random() * ((3 - 1) + 1));
		return chiffre;
	}
	
	public String toString() {
		return Integer.toString(chiffre);
	}

	public int getChiffre() {
		return chiffre;
	}

	public void setChiffre(int chiffre) {
		this.chiffre = chiffre;
	}
}
