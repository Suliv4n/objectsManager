package models;

public class Personne{
	private String nom;
	private String inventaire;
	
	public Personne(String nom, String inventaire){
			this.nom = nom;
			this.inventaire = inventaire;
	}
	
	public String getNom(){
			return nom;
	}
	
	public String getInventaire(){
			return inventaire;
	}			
}	
