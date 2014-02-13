package models;

import javax.persistence.*;
 
import play.db.ebean.*;

@Entity
public class Effet{
	
	private int type;
	private int puissance;
	private int duration;
	
	public static final int SOIN = 1;
	
	public Effet(int type, int puissance, int duration)
	{
		this.type = type;
		this.puissance = puissance;
		this.duration = duration;
	}
	
	public Effet(int type, int puissance)
	{
		this.type = type;
		this.puissance = puissance;
		this.duration = 0;
	}
	
	public int getType()
	{
		return this.type;
	}
	
	public int getPuissance()
	{
		return puissance;
	}
	

}
