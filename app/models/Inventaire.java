

public class Inventaire {

    int taille;
    String objet[];
    public Inventaire(int i){
	this.taille = i;
	objet = new String [taille];
	this.objet[0]="objet";
	this.objet[1]="objet2";
    }

    public int  getTailleInventaire(){
	return this.taille;
    }
    
    public String getObjetInventaire(int i){
	return this.objet[i];
}
	
	public void addObjet(String nom, int index){
		this.objet[index]=nom;
		}
}

