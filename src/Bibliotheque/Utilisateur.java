package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur extends Personne {
	private String nom, date_de_naissance;
	private int numAdherance;
	private List <String> livresEmpruntes;
	
	public Utilisateur(String nom, String ddn, int id) {
		this.nom = nom;
		this.date_de_naissance = ddn;
		this.numAdherance = id;
		this.livresEmpruntes = new ArrayList<>();
	}
	
	
	/* Getters and setters */
	public String getName() {
		return this.nom;
	}
	
	public void setName(String name) {
		this.nom = name;
	}
	
	public String getBirthday() {
		return this.date_de_naissance;
	}
	
	public void setBirthday(String ddn) {
		this.date_de_naissance = ddn;
	}
	
	public int getId() {
		return this.numAdherance;
	}
	
	public void setId(int newId) {
		this.numAdherance = newId;
	}
	
	public List <String> getLivresEmpruntes() {
		return this.livresEmpruntes;
	}
	
	public void setLivresEmpruntes(List <String> newLivre) {
		this.livresEmpruntes = newLivre;
	}
	/* End of getters and setters */
	
	
	/* Borrow method */
	public void emprunterLivres(Livre unLivre) {
		if (unLivre.getNbExemplaires() > 0) {
			this.livresEmpruntes.add( unLivre.getTitle() );
			unLivre.emprunter();
			System.out.println("Le livre " + unLivre.getTitle() + " a été emprunté avec succès !!!");
		}
		else {
			System.out.println("There is no more exemplary of this book. Please choose another one.");
		}
	}
	
	/* Bring back a book method */
	public void retournerLivre(Livre livreR) {
		if ( this.livresEmpruntes.contains(livreR.getTitle()) ) {
			this.livresEmpruntes.remove(livreR.getTitle());
			livreR.retourner();
			System.out.println("Le livre " + livreR.getTitle() + " a été retourné avec succès !!!");
		}
		else {
			System.out.println("This book was not borrow here.");
		}
	}
	
	/* toString method */
	public String toString() {
		return "Utilisateur : " + this.nom + "\n Date de naissance : " + this.date_de_naissance +
				"Numéro d'adhérence : " + this.numAdherance + "\n Livres empruntés : " + this.livresEmpruntes;
	}
	
	public void afficherDetails() {
		System.out.println("Utilisateur : " + this.nom + "\nDate de naissance : " + this.date_de_naissance +
				"\nNuméro d'adhérence : " + this.numAdherance + "\nLivres empruntés : " + this.livresEmpruntes);
	}
}
