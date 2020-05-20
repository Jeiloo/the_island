package Controleur;

import Modele.*;

public class Controleur {
	public static Plateau plateau;
	public static De de;
	public static Reserve reserve;
	
	public static void main(String[] args) {
		plateau = new Plateau();
		de = new De();
		reserve = new Reserve();
		print(reserve);
		reserve.removeTuile(new Tuile(1,2,1,-1,-1));
		print("");
		print(reserve);
	}
	
	public static void print(Object o) {
		System.out.println(o);
	}
}
