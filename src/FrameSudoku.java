import javax.swing.*;
import java.awt.*;

public class FrameSudoku extends JFrame
{
	private PanelSudo    panelSudo;
	private PanelBoutons panelBtn ;
	private Tableau 	 plat	  ; 

	public FrameSudoku (Tableau plat)
	{
		this.setTitle   ("Grille" 	);
		this.setSize    ( 500,500  	);
		this.setLocation( 150, 50  	);
		this.setResizable(false		);
		this.setLayout (new BorderLayout());
		


		this.plat=plat;
		this.panelSudo=new PanelSudo(this.plat);
		this.panelBtn=new PanelBoutons(this.plat);

		this.add(this.panelSudo, BorderLayout.CENTER);
		this.add(this.panelBtn,  BorderLayout.SOUTH);


		this.setVisible(true);
	}

	
}
