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
				System.out.println(this.tabCase[i][j]);
			}
			System.out.println("\n");
		}
		
	}

	public int getTaille(){return this.taille;}
	public Case[][] getCases(){return this.tabCase;}

	public static void main(String[] args) 
	{
		new Tableau();
	}
}