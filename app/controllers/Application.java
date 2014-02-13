package controllers;

import java.util.ArrayList;

import com.avaje.ebean.Ebean;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;

public class Application extends Controller {

	private static Personne personne;
	private static ArrayList<Inventaire> coffres;
	
    public static Result index() 
    {
        return ok(index.render(""));
    }
	
	public static Result inventaire()
	{
		String test = "Pas de création de personne (déja existant)";
		if(personne == null)
		{
			test = "Nouveau personne";
			personne  = new Personne("Draven",10);
			ArrayList<Effet> effets = new ArrayList<Effet>();
			effets.add(new Effet(Effet.SOIN,10,0));
			personne.getInventaire().addObjet(new Potion("Potion de soin",10,effets),0);
			personne.getInventaire().addObjet(new Objet("Bougie",0),1);
			
			
			coffres = new ArrayList<Inventaire>();
			models.Inventaire inv = new models.Inventaire(10);
			inv.addObjet(new Objet("Tarte au citron"), 2);
			coffres.add(inv);
			
		}
		return ok(inventaire.render(personne, coffres));
	}
	
	public static Result interactionObjets(int actioner, String targ)
	{
		if(personne == null)
		{
			return redirect("/inventaire");
		}
		
		String message = "";
		Objet actionneur = null;
		Objet target = null;
		if(targ.equalsIgnoreCase("personne"))
		{
			target = personne;
		}
		else if(targ.matches("[0-9]+"))
		{
			target = personne.getInventaire().getObjetInventaire(Integer.parseInt(targ));
		}
		if(target == null)
		{
			message="Taget invalide";
		}
		else
		{
			actionneur = personne.getInventaire().getObjetInventaire(actioner);
			if(actionneur.doAction(target))
			{
				message = "interaction réussi.";
			}
			else
			{
				message = "Les objets ne peuvent pas intéragir.";
			}
		}
		return ok(interaction.render(message, actionneur, target));
	}
	
	public static Result deplacerObjet(int i, int j)
	{
		if(personne == null)
		{
			return redirect("/inventaire");
		}

		personne.getInventaire().deplacerObjet(i,j);
		return redirect("/inventaire");

	}
	
	public static Result deplacerObjetCoffre(int i, int j, int c)
	{
		personne.getInventaire().deplacerObjet(i,j, coffres.get(c));
		return redirect("/inventaire");
	}
	

	
	
    

}
