package models;
import models.*;

public class Inventaire {

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
		
	public void delObjet(int index){
		if(this.objet[index]!= null)
			this.objet[index]=null;
			
		}
	public void deplacerObjet(int i, int j){
		Objet tmp = new Objet(objet[i].getNom(),objet[i].getPrix(),objet[i].estEquipable());
		delObjet(i);
		delObjet(j);
		addObjet(tmp.getNom(),tmp.getPrix(),tmp.estEquipable(),j);
		
		}
}

