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
			

		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("ca marche pas");
			return false;
		}
		return true;
	}

	public boolean verifierTableau ()
	{
		Case[] temp = new Case[9];
		int cpt=0;

		for (Case[] ligne : this.tabCase)
			if (estEnDouble(ligne)){System.out.println ("erreur2");return false;}

		for (int i=0; i<tabCase.length; i++)
		{
			temp = new Case[9];
			cpt=0;
			for (int j=0; j<tabCase[0].length; j++)
			{
				//System.out.println(cpt + " | "+i+" | "+j);
				if (tabCase[i][j].getValeur()==0){System.out.println ("erreur1");return false;}
				temp[cpt]=tabCase[j][i];
				cpt++;
			}
			if (estEnDouble(temp)){System.out.println ("erreur3");return false;}
		}

		return true;

	}

	public void valider ()
	{
		if (verifierTableau())
				System.out.println("Bien Joué");
	}

	private boolean estEnDouble (Case[] tab)
	{
		for (int i=0; i<tab.length; i++)
			for (int j=i+1; j<tab.length; j++)
				if (tab[i].getValeur()==tab[j].getValeur())
					return true;
		return false;
	}

	/*public String toString()
	{
		String str="\n";
		for (int j=0; j<tabCase.length;j++){str+="-"}
		for (int i=0; i<tabCase.length;i++)
		{
			
			for (int j=0; j<tabCase.length;j++)
			{

			}
		}
			
	}*/

	public static void main(String[] args) 
	{
		new Tableau();
	}
}