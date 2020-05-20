package Modele;

public class Plateau {
	public Case[][] plateau;
	
	public Plateau() {
		int[] jTab = {7,10,11,10,11,12,11,12,11,10,11,10,7};  // nombre de cases selon la ligne du plateau
		
		plateau = new Case[13][];
		for(int i=0; i<13; i++) {
			plateau[i] = new Case[jTab[i]];
			for(int j=0; j<jTab[i]; j++) {
				if( ((i==1 && (j==0 || j==9)))   || 
					((i==2 && (j==0 || j==10)))  || 
					((i==10 && (j==0 || j==10))) ||
					((i==11 && (j==0 || j==9)))   )       
					plateau[i][j] = new Case(i,j,1); // plage
				else if(((i==3 && j>2 && j<7))  || 
						((i==4 && j>2 && j<8))  || 
						((i==5 && j>1 && j<10)) || 
						((i==6 && j>1 && j<9))  || 
						((i==7 && j>1 && j<10)) || 
						((i==8 && j>2 && j<8))  || 
						((i==9 && j>2 && j<7))   )
					plateau[i][j] = new Case(i,j,3); // mer profonde
				else
					plateau[i][j] = new Case(i,j,2); // mer normale
			}
		}
	}
	
	public String toString() {
		String ret = "";
		for(int i=0; i<plateau.length; i++) {
			for(int j=0; j<plateau[i].length; j++) {
				ret = ret.concat(plateau[i][j].type+" ");
			}
			ret = ret.concat("\n");
		}
		return ret;
	}
	
	public Case[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}

	public Case getCase(int xPar, int yPar) {
		return plateau[xPar][yPar];
	}
	
	public void setCase(int xPar, int yPar, Case casePar) { //change une case
		plateau[xPar][yPar].x = casePar.x;
		plateau[xPar][yPar].y = casePar.y;
		plateau[xPar][yPar].type = casePar.type;
	}
}
