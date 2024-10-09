import javax.swing.*;

public class FrameSudoku extends JFrame
{
	private PanelSudo  panelSudo;
	private Tableau plat		 ; 

	public FrameSudoku (Tableau plat)
	{
		this.setTitle   ("Grille" );
		this.setSize    ( 500,500  );
		this.setLocation( 150, 50  );


		this.plat=plat;
		this.panelSudo=new PanelSudo(this.plat);

		this.add(this.panelSudo);

		this.setVisible(true);
	}

	
}
