public class Tableau 
{
	private int			taille ;
	private Case[][]	tabCase;
	private FrameSudoku sudoc;

	public Tableau ()
	{
		this.taille = Scaner.getTaille();
		this.tabCase = new Case[this.taille][this.taille];
		this.initTableau();

		this.sudoc=new FrameSudoku(this);

	}

	public void initTableau()
	{
		if (this.taille==0) return ;

		for (int i=0 ; i<this.taille; i++)
		{
			for (int j=0; j<this.taille; j++)
			{
				this.tabCase[i][j] = new Case(i,j,Scaner.getValeur(i,j));
				//System.out.println(this.tabCase[i][j]);
			}
			//System.out.println("\n");
		}
		
	}

	public int getTaille(){return this.taille;}
	public Case[][] getCases(){return this.tabCase;}

	public boolean modifierCase (String valeur, int i, int j)
	{
		int valeurInt;
		try 
		{
			if (valeur.equals(""))
				valeurInt=0;
			else
				valeurInt=Integer.parseInt(valeur);
			
			if (valeurInt<0 || valeurInt>9) return false;

			//System.out.println(tabCase[j][i]);
			tabCase[j][i].setValeur(valeurInt);
			//System.out.println(tabCase[j][i]);
			if (verifierTableau())
				System.out.println("Bien Joué");

		}
		catch(Exception e)
		{
			System.out.println("ca marche pas");
			return false;
		}
		return true;
	}

	public boolean verifierTableau ()
	{
		int valeurTempI;
		int valeurTempJ;
		
		for (int i=0; i<tabCase.length;i++)
		{
			valeurTempJ=tabCase[i][0].getValeur();
			valeurTempI=tabCase[0][i].getValeur();

			for (int j=0; j<tabCase.length; j++)
			{
				if (tabCase[i][j].getValeur()==valeurTempJ && j!=0) return false;
				if (tabCase[j][i].getValeur()==valeurTempJ && i!=0) return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		new Tableau();
	}
}