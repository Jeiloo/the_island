package Modele;

import java.util.ArrayList;

public class Reserve { // represente les tuiles et les pions dans la reserve
	ArrayList<Tuile> Tuiles; // toutes les tuiles
	ArrayList<Pion> Pions; // tous les pions
	
	public Reserve() { // tous les pions et tuiles sont initialise aux coordonnees -1;-1
		Tuiles = new ArrayList<Tuile>();
		Pions = new ArrayList<Pion>();
		
		for(int i=0; i<3; i++)
			Tuiles.add(new Tuile(1,2,1,-1,-1)); // 3* plage,baleine,vert
		for(int i=0; i<3; i++)
			Tuiles.add(new Tuile(1,1,1,-1,-1)); // 3* plage,requin,vert
		Tuiles.add(new Tuile(1,3,1,-1,-1)); // 1* plage,bateau,vert
		Tuiles.add(new Tuile(1,3,2,-1,-1)); // 2* plage,bateau,rouge
		Tuiles.add(new Tuile(1,3,2,-1,-1));
		for(int i=0; i<3; i++)
			Tuiles.add(new Tuile(1,6,2,-1,-1)); // 3* plage,dauphin,rouge
		Tuiles.add(new Tuile(1,7,2,-1,-1)); // 1* plage,serpent,rouge
		Tuiles.add(new Tuile(1,1,2,-1,-1)); // 1* plage,requin,rouge
		Tuiles.add(new Tuile(1,2,2,-1,-1)); // 1* plage,baleine,rouge
		Tuiles.add(new Tuile(1,1,3,-1,-1)); // 1* plage,requin,defence
		
		Tuiles.add(new Tuile(2,2,1,-1,-1)); // 2* foret,baleine,vert
		Tuiles.add(new Tuile(2,2,1,-1,-1));
		Tuiles.add(new Tuile(2,1,1,-1,-1)); // 2* foret,requin,vert
		Tuiles.add(new Tuile(2,1,1,-1,-1));
		for(int i=0; i<3; i++)
			Tuiles.add(new Tuile(2,3,1,-1,-1)); // 3* foret,bateau,vert
		Tuiles.add(new Tuile(2,4,1,-1,-1)); // 2* foret,tourbillon,vert
		Tuiles.add(new Tuile(2,4,1,-1,-1));
		Tuiles.add(new Tuile(2,6,2,-1,-1)); // 1* foret,dauphin,rouge
		Tuiles.add(new Tuile(2,7,2,-1,-1)); // 1* foret,serpent,rouge
		Tuiles.add(new Tuile(2,1,2,-1,-1)); // 1* foret,requin,rouge
		Tuiles.add(new Tuile(2,2,2,-1,-1)); // 1* foret,baleine,rouge
		Tuiles.add(new Tuile(2,1,3,-1,-1)); // 1* foret,requin,defence
		Tuiles.add(new Tuile(2,2,3,-1,-1)); // 2* foret,baleine,defence
		Tuiles.add(new Tuile(2,2,3,-1,-1));
		
		Tuiles.add(new Tuile(3,1,1,-1,-1)); // 1* montagne,requin,vert
		for(int i=0; i<4; i++)
			Tuiles.add(new Tuile(3,4,1,-1,-1)); // 4* montagne,tourbillon,vert
		Tuiles.add(new Tuile(3,5,1,-1,-1)); // 1* montagne,volcan,vert
		Tuiles.add(new Tuile(3,1,3,-1,-1)); // 1* montagne,requin,defence
		Tuiles.add(new Tuile(3,2,3,-1,-1)); // 1* montagne,baleine,defence
		
		int[] kTab = {3,2,2,1,1,1}; // nombre de pions selon le score
		for(int i=1; i<5; i++) { // 4* couleurs de pions
			for(int j=1; j<7; j++) { // 1-6 score sur le pions
				for(int k=0; k<kTab[j-1]; k++) { // nombre de pions
					Pions.add(new Pion(1,j,i,-1,-1)); // 40* pions explorateur, 10 de chaque couleur, avec un score attitré
				}
			}
		}
		
		for(int i=0; i<5; i++)
			Pions.add(new Pion(2,1,0,-1,-1)); // 5* serpent
		for(int i=0; i<6; i++)
			Pions.add(new Pion(2,2,0,-1,-1)); // 6* requin
		for(int i=0; i<5; i++)
			Pions.add(new Pion(2,3,0,-1,-1)); // 5* baleine
		
		for(int i=0; i<12; i++)
			Pions.add(new Pion(3,0,0,-1,-1)); // 12* bateau
	}
	
	public boolean existTuile(Tuile tuile) { // true si la tuile en parametre existe dans la reserve
		for(Tuile t : Tuiles) {
			if(tuile.compareTo(t)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean existPion(Pion pion) { // true si le pion en parametre existe dans la reserve
		for(Pion p : Pions) {
			if(pion.compareTo(p)) {
				return true;
			}
		}
		return false;
	}
	
	public void ajoutTuile(Tuile tuile) { // ajoute la tuile à la liste de Tuiles
		tuile.x = -1;
		tuile.y = -1; // change les coordonnees de la tuile pour la mettre en reserve
		Tuiles.add(tuile);
	}
	
	public void ajoutPion(Pion pion) { // ajoute le pion à la liste de Pions
		pion.x = -1;
		pion.y = -1; // change les coordonnees du pion pour le mettre en reserve
		Pions.add(pion);
	}
	
	private int getIndexOfTuile(Tuile tuile) {
		//itterator pour avoir index
		return 0;
	}

	private int getIndexOfPion(Pion pion) {
		//itterator pour avoir index
		return 0;
	}
	
	public void removeTuile(Tuile tuile) { // retire une tuile de la liste de Tuiles (un seul exemplaire)
		Tuiles.remove(Tuiles.get(this.getIndexOfTuile(tuile)));
	}
	
	public void removePion(Pion pion) { // retire un pion de la liste de Pions (un seul exemplaire)
		Pions.remove(Pions.get(this.getIndexOfPion(pion)));
	}
	
	public String toString() {
		String ret = "Pions : ";
		for(Pion p : Pions)
			ret = ret.concat(p.toString()+", ");
		ret = ret.substring(0, ret.length() - 2); // juste pour enlever la derniere virgule :D
		ret = ret.concat("\nTuiles : ");
		for(Tuile t : Tuiles)
			ret = ret.concat(t.toString()+", ");
		ret = ret.substring(0, ret.length() - 2); // pareil
		return ret;
	}

	public ArrayList<Tuile> getTuiles() {
		return Tuiles;
	}

	public void setTuiles(ArrayList<Tuile> tuiles) {
		Tuiles = tuiles;
	}

	public ArrayList<Pion> getPions() {
		return Pions;
	}

	public void setPions(ArrayList<Pion> pions) {
		Pions = pions;
	}
}
