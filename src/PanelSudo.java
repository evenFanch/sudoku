import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PanelSudo extends JPanel implements ActionListener 
{
	private Tableau 	   plat  ;
	private JTextField[][] tabTxt;
	private Graphics2D g2	;

	public PanelSudo (Tableau plat)
	{
		this.plat=plat;
		this.tabTxt=new JTextField[plat.getTaille()][plat.getTaille()];

		this.setLayout(new GridLayout(plat.getTaille()+2,plat.getTaille()+2));
		this.repaint();

		int cptI, cptJ;

		cptJ=cptI=0;

		for (int i=0; i<plat.getTaille()+2; i++)
		{
			cptJ=0;
			for (int j=0;j<plat.getTaille()+2;j++)
			{
				if (i==3 || i==7 || j==3 || j==7)
					this.add(new JPanel());
				else
				{
					if (plat.getCases()[cptJ][cptI].getValeur()==0)
						this.tabTxt[cptI][cptJ]= new JTextField ();
					else 
						this.tabTxt[cptI][cptJ]= new JTextField (plat.getCases()[cptJ][cptI].getValeur()+"");

					this.add(this.tabTxt[cptI][cptJ]);
					System.out.println(i+"|"+j+"      "+cptI+" : "+cptJ);
					cptJ++;
					
				}
				
			}
			if (!(i==2 || i==6 ))
				cptI++;
		}
	}

	public void paintComponent(Graphics g)
	{
		this.g2 = (Graphics2D) g;

		g.drawLine(0,166,500,166);
		g.drawLine(0,332,500,332);
		g.drawLine(166,0,166,500);
		g.drawLine(332,0,332,500);
	}

	public void actionPerformed(ActionEvent e)
	{
		for (int i=0; i<plat.getTaille()+2; i++)
		{
			for (int j=0;j<plat.getTaille()+2;j++)
			{
				if (this.tabTxt[i][j].equals(e))
					return;

			}
		}
	}
}