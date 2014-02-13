package models;
import javax.persistence.*;
 
import play.db.ebean.*;

@MappedSuperclass
public class Inventaire extends Model{

    int taille;
	
    Objet objet[];
	
    public Inventaire(int i){
		this.taille = i;
		objet = new Objet [taille];
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
	public void deplacerObjet(int i, int j){
		Objet tmp = new Objet(objet[i].getNom(),objet[i].getPrix(),objet[i].estEquipable());
		Objet tmp2;
		if(objet[j]==null)
			tmp2=new Objet(objet[j].getNom(),objet[j].getPrix(),objet[j].estEquipable());
		delObjet(i);
		delObjet(j);
		addObjet(tmp.getNom(),tmp.getPrix(),tmp.estEquipable(),j);
		addObjet(tmp2.getNom(),tmp.getPrix(),tmp.estEquipable(),i);
		
		}


}

