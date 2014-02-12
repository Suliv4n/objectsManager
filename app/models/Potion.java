import java.util.ArrayList;
import models.*;

public class Potion extends Objet{
	
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
		if(Objet instanceof Personne)
		{
			for(Effet e : effets)
			{
				if(e.getType() == Effet.SOIN)
				{
					((Personne)target).updatePV(e.getValue());
					return true;
				}
			}
		}
		return false;
	}

}
