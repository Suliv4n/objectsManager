public class Objet{
    
    private String nom;
	private int prix;
	private boolean equipable;

    public Objet(String nom, int prix)
    {
		this.nom=nom;
		this.prix=prix;
    }
    
    public Objet(String nom, int prix, boolean equipable)
    {
		this.nom=nom;
		this.prix=prix;
		this.equipable = false;
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
