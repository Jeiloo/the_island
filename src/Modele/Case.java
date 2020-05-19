package Modele;

public class Case {
	int x, y;
	int type; // 1:plage 2:foret 3:montagne 4:mer
	
	public Case(int xPar, int yPar, int typePar) {
		if(typePar<1 || typePar>4)
			throw new IllegalArgumentException("type non valide");
		x=xPar; y=yPar;
		type=typePar;
	}
}
