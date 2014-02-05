package models;

public class Objet{
    
    private String nom;
	private int prix;
	private boolean equipable;
	private int etat;
	
	public static final int INTACT = 0;
	public static final int COUPE = 1;

    public Objet(String nom, int prix)
    {
		this.nom=nom;
		this.prix=prix;
		this.etat=INTACT;
    }
    
    public Objet(String nom, int prix, boolean equipable)
    {
		this.nom=nom;
		this.prix=prix;
		this.equipable = false;
		this.etat=INTACT;
    }
    
    public String getNom(){
		return nom;
    }
    
    public int getPrix()
    {
		return prix;
	}
	
	public boolean estEquipable()
	{
		return equipable;
	}
}
