public class Case 
{
	private int valeur ;
	private int x,y    ;

	public Case (int x, int y, int valeur)
	{
		this.x=x;
		this.y=y;
		this.valeur=valeur;
	}

	public void setValeur(int valeur){this.valeur=valeur;}

	public int getX(){return this.x;}
	public int getY(){return this.y;}
	public int getValeur(){return this.valeur;}

	public String toString()
	{
		return "Case : "+this.x+" | "+this.y+"  valeur : "+this.valeur;
	}

}