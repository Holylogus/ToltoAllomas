package Main;
import java.util.Iterator;

import Model.*;

public class ToltoAllomasProgram {
	private ToltoAllomas allomas;
	
	public static void main(String[] args) {
		new ToltoAllomasProgram();

	}

	public ToltoAllomasProgram() {
		allomas = new ToltoAllomas(5);
		allomas.felvesz(new Urhajo("Patrik"));
		allomas.felvesz(new Urhajo("Gyuri"));
		allomas.felvesz(new Urhajo("Zsolt"));
		allomas.felvesz(new Urhajo("Dani"));
		allomas.felvesz(new Urhajo("Balázs"));
		
		System.out.println("---Tankolás Előtt");
		urhajoKiir();
		
		System.out.println("---Tankolás után");
		allomas.tankoltatt(Uzemanyag.Hidrogén);
		urhajoKiir();
		
		System.out.println("---Patrik és Balázs és Zsolt kiveszi a hajóját");
		allomas.kiad("Patrik");
		allomas.kiad("Balázs");
		allomas.kiad("Zsolt");
		System.out.println("--bentmaradt hajók");
		urhajoKiir();
		
		System.out.println("---Patrik beteszi Starship hajóját, Béla Shepard-ot, Gazsi Moon-t");
		allomas.felvesz(new Starship("Patrik"));
		allomas.felvesz(new Shepard("Béla"));
		allomas.felvesz(new Moon("Gazsi"));
		System.out.println("---bentlévő hajók");
		urhajoKiir();
	}

	private void urhajoKiir() {
		for (String urhajo : allomas.urhajokLeirasa()) {
			if (urhajo != null) {
				System.out.println(urhajo);
			} else {
				System.out.println("Ez a Dokk üres");
			}
		}
		
	}
	
}
