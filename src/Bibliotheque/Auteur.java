package Bibliotheque;

public class Auteur extends Personne {
	private String nom, bibiographie, date_de_naissance;
	
	Auteur (String name, String biog, String ddn) {
		this.nom = name;
		this.nom = this.nom.toUpperCase();
		this.bibiographie = biog;
		this.setDate_de_naissance(ddn);
	}

	/* Getters and setters for my attributes */
	public String getNom() {
		return nom;
	}
	
	public void setNom(String name) {
		this.nom = name;
	}
	
	public String getBibiographie() {
		return bibiographie;
	}
	
	public void setBibiographie(String bibiographie) {
		this.bibiographie = bibiographie;
	}
	
	public String getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(String date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}
	/* End of the implementations of the getters and setters */
	
	/* toString method */
	public String toString() {
		return "Nom de l'auteur: " + nom + "\n Date de naissance : " + date_de_naissance + "\n"
				+ "Bibiograpgie : " + bibiographie;
	}
	
	public void afficherDetails() {
		System.out.println("Nom de l'auteur: " + nom + "\n Date de naissance : " + date_de_naissance + "\n"
				+ "Bibiograpgie : " + bibiographie);
	}
}
