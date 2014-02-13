package models;
import models.*;
import javax.persistence.*;
 
import play.db.ebean.*;

@Inheritance
public class Personne extends Objet{

	@OneToOne
	private Inventaire inventaire;
	
	private int pv;
	private int pvmax;
	
	public Personne(String nom, int i){
			super(nom);
			
			this.inventaire = new Inventaire(i);
			pv = 100;
	}
	
	public Personne(String nom, int i, int pvmax){
			super(nom);
			this.inventaire = new Inventaire(i);
			this.pv = pvmax;
			this.pvmax = pvmax;
	}
	
	
	public Inventaire getInventaire(){
			return inventaire;
	}
	
	
	public int getPV()
	{
		return pv;
	}
	
	public void updatePV(int delta)
	{
		pv += delta;
		if(pv<0)
		{
			pv=0;
		}
		else if(pv>pvmax)
		{
			pv=pvmax;
		}
	}
}	
