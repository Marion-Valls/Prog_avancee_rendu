package examenFA2223ETU;

import java.util.Collection;

public final class Reussite {
	private final PileLIFO<Carte> poubelle;
	private final FileFIFO<Carte> pioche;

	private static Reussite creerInstanceReussite() {
		return new Reussite();
	}

	private Reussite() {
		this.poubelle  = new PileLIFOArray();
		this.pioche = new FileFIFOListe();
		for(Carte c : Carte.values()) {
			this.pioche.ajouter(c);
		}
		this.pioche.melanger();
	}

	private void retournerPoubelle(){
		while(!this.poubelle.estVide()) {
			try {
				this.pioche.ajouter(this.poubelle.depiler());
			} catch (AucunElementException e) {
				e.printStackTrace();
			}
		}
	}

	private PileLIFO<Carte> getPoubelle() {
		return this.poubelle;
	}

	private FileFIFO<Carte> getPioche() {
		return this.pioche;
	}

	public static void mainETUDIANT(String[] args) {
		Reussite partie = Reussite.creerInstanceReussite();

		for (int i = 0; i < 3; i++) {
			System.out.format("************\nItération n°%d\n", i + 1);
			if (i > 1) {
				System.out.println("La pioche est mélangée...");
				partie.getPioche().melanger();
			}
			System.out.format("nouvelle pioche : %s\n", partie.getPioche());
			System.out.format("Nouvelle poubelle : %s\n", partie.getPoubelle());
			while (!partie.getPioche().estVide()) {
				try {
					Carte c = partie.getPioche().retirer();
					System.out.format("nouvelle carte piochée : %s\n", c.toString());
					partie.getPoubelle().empiler(c);
					System.out.format("Mis à la poubelle : %s\n", c);
				} catch (AucunElementException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Pioche vide.");
			System.out.format("Poubelle : %s\n", partie.getPoubelle());
			partie.retournerPoubelle();
			System.out.println("Après retournement...");
			System.out.format("nouvelle pioche : %s\n", partie.getPioche());
			System.out.format("Nouvelle poubelle : %s\n", partie.getPoubelle());
		}
	}


	public static void main(String[] args) {
		Reussite.mainETUDIANT(args);
	}
}
