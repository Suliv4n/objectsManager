public class Objet{
    
    private String nom;
	private int prix;

    public Objet(String nom, int prix)
    {
		this.nom=nom;
		this.prix=prix;
    }
    
    public String getNom(){
		return nom;
    }
    
    public int getPrix()
    {
		return prix;
	}
}
