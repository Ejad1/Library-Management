package Bibliotheque;

public class Livre {
	private String titre;
	private Auteur auteur;
	private int anneePublication, nbEx;
	
	public Livre(String titre, Auteur author, int an, int nbre) {
		this.titre = titre;
		this.auteur = author;
		this.anneePublication = an;
		this.nbEx = nbre >= 0 ? nbre : -nbre;
	}
	
	/* Getters and setters */
	public String getTitle() {
		return this.titre;
	}
	
	public int getNbExemplaires() {
		return this.nbEx;
	}
	
	public void setNbExemplaires(int newNb) {
		this.nbEx = newNb;
	}
	/* End of the implementations of getters and setters */
	
	/* Borrow method */
	public void emprunter() {
		this.nbEx -= 1;
	}
	
	/* Bring back method */
	public void retourner() {
		this.nbEx += 1;
	}
	
	/* toString method */
	public String toString() {
		return "Livre : " + this.titre + "\n Auteur : " + this.auteur + "\n Année de publication : "
				+ this.anneePublication + "\n Nombre d'exemplaires en stock : " + this.nbEx;
	}
}
