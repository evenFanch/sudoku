import java.io.FileReader;
import java.util.Scanner;


public class Scaner 
{

	public static int getTaille()
	{
		String ligne;
		FileReader fr;

		try
		{
			fr = new FileReader ("modele.data");

			Scanner scDept = new Scanner ( fr);


			ligne = scDept.nextLine();

			return Integer.parseInt (ligne.charAt(0)+"");

		}
		catch(Exception e){ e.printStackTrace(); }

		return 0;
	}

	public static int getValeur(int x, int y)
	{
		String ligne;
		FileReader fr;

		try
		{
			fr = new FileReader ("modele.data");

			Scanner scDept = new Scanner ( fr);

			ligne = scDept.nextLine();
			ligne = scDept.nextLine();
			ligne = scDept.nextLine();

			for (int i=0; i<y;i++)
			{
				if (scDept.hasNextLine())
					ligne = scDept.nextLine();
			}
				

			//System.out.println(Integer.parseInt (ligne.charAt(x)+""));
			return Integer.parseInt (ligne.charAt(x)+"");

		}
		catch(Exception e){ e.printStackTrace(); }

		return 0;
	}
}