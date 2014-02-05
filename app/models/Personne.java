package models;
import models.Inventaire;

public class Personne{
	private String nom;
	private Inventaire inventaire;
	
	public Personne(String nom, int i){
			this.nom = nom;
			this.inventaire = new Inventaire(i);
	}
	
	public String getNom(){
			return nom;
	}
	
	public Inventaire getInventaire(){
			return inventaire;
	}			
}	
