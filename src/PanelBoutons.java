import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PanelBoutons extends JPanel implements ActionListener 
{
	private JButton btn;
	private Tableau tab;

	public PanelBoutons (Tableau tab)
	{
		this.btn = new JButton("Valider ");
		this.tab=tab;
		this.setLayout (new FlowLayout());

		this.btn.addActionListener(this);

		this.add(this.btn);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		this.tab.valider();
	}
}