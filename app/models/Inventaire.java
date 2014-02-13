package models;
import javax.persistence.*;
 
import play.db.ebean.*;

@MappedSuperclass
public class Inventaire extends Model{

	@Id
	private int id;
	
    private int taille;
	
    private Objet objet[];
	
    public Inventaire(int i){
		super();
		this.taille = i;
		objet = new Objet [taille];
    }
    
    
    public Objet[] getObjets()
    {
		return objet;
	}

    public int  getTailleInventaire(){
		return this.taille;
    }
    
    public Objet getObjetInventaire(int i){
		return objet[i];
}


	public void addObjet(String nom,int prix, boolean equ, int index){
		if(this.objet[index]== null){
			this.objet[index]=new Objet(nom,prix,equ);
		}
	}
	
	public void addObjet(Objet objet, int index){
		if(this.objet[index]== null){
			this.objet[index]=objet;
		}
	}
		
	public void delObjet(int index){
		if(this.objet[index]!= null)
			this.objet[index]=null;
			
		}
	public void deplacerObjet(int i, int j)
	{
		/*
		Objet tmp = new Objet(objet[i].getNom(),objet[i].getPrix(),objet[i].estEquipable());
		delObjet(i);
		delObjet(j);
		addObjet(tmp.getNom(),tmp.getPrix(),tmp.estEquipable(),j);
		*/
		
		Objet tmp = objet[i];
		objet[i] = objet[j];
		objet[j] = tmp;
	}

	public void deplacerObjet(int i, int j, Inventaire inventaire)
	{
		Objet tmp = objet[i];
		objet[i] = inventaire.objet[j];
		inventaire.objet[j] = tmp;
	}

}

