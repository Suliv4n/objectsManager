package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;


public class Application extends Controller {

	private static Personne personne;
	
    public static Result index() 
    {
        return ok(index.render(""));
    }
	
	public static Result inventaire()
	{
		if(personne == null)
		{
			Personne = new Personne("Draven",10);
			ArrayList<Effet> effets = new ArrayList<Effet>();
			effets.add(new Effet(Effet.SOIN,10,0));
			personne.getInventaire().addObjet(new Potion("Potion de soin",10,effets),0);
			personne.getInventaire().addObjet(new Objet("Bougie",0,0),1);
		}
		return ok(inventaire.render(personne));
	}
    

}
