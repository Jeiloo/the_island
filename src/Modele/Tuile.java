package Modele;

public class Tuile {
	int x, y;
	int recto; // 1:plage 2:foret 3:montagne
	int verso; // 1:requin 2:baleine 3:bateau 4:tourbillon 5:volcan 6:dauphin 7:vent 8:serpent
	int type; // 1:immediate(vert) 2:debut(rouge) 3:dehors(defense rouge)
	
	public Tuile(int rectoPar, int versoPar, int typePar, int xPar, int yPar) {
		if(rectoPar<1 || rectoPar>3)
			throw new IllegalArgumentException("recto non valide");
		if(versoPar<1 || versoPar>8)
			throw new IllegalArgumentException("verso non valide");
		if(typePar<1 || typePar>3)
			throw new IllegalArgumentException("type non valide");
		recto=rectoPar;
		verso=versoPar;
		type=typePar;
		x=xPar; y=yPar;
	}
}
