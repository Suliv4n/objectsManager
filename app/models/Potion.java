package models;

import java.util.ArrayList;
import models.*;
import javax.persistence.*;
 
import play.db.ebean.*;

@Inheritance
public class Potion extends Objet{



	@ManyToMany(mappedBy="effet", cascade=CascadeType.ALL)
	private ArrayList<Effet> effets;
	
	public Potion(String nom, ArrayList<Effet> effets)
	{
		super(nom);
		this.effets = effets;
	}
	
	public Potion(String nom, int prix, ArrayList<Effet> effets)
	{
		super(nom, prix);
		this.effets = effets;
	}
	
	public ArrayList<Effet> getEffets()
	{
		return effets;
	}
	
	@Override
	public boolean doAction(Objet target)
	{
		if(target instanceof Personne)
		{
			for(Effet e : effets)
			{
				if(e.getType() == Effet.SOIN)
				{
					((Personne)target).updatePV(e.getPuissance());
					return true;
				}
			}
		}
		return false;
	}

}
