import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class KolkoiKrzyzyk extends JFrame implements ActionListener{

	JPanel panel = new JPanel();
	XOButton buttons [] = new XOButton [9]; 
	JMenuBar menuBar;
	JMenu Plik,Pomoc;
	JMenuItem itemNowaGra,itemWyjscie,itemJakGrac,itemOProgramie;
	
	public static void main(String[] args) {
	
		new KolkoiKrzyzyk();
		
	}

		public KolkoiKrzyzyk(){
			
			this.setTitle("Kółko i krzyżyk");
			setSize(400,400);
			
			menuBar = new JMenuBar(); 
			setJMenuBar(menuBar);
			
			Plik = new JMenu("Plik");
				
				menuBar.add(Plik);
				
				itemNowaGra = new JMenuItem("Nowa Gra",'N');
				itemNowaGra.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
				itemNowaGra.addActionListener(this);
				Plik.add(itemNowaGra);
				
				Plik.addSeparator();
				itemWyjscie = new JMenuItem("Wyjście",'W');
				itemWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
				itemWyjscie.addActionListener(this);
				Plik.add(itemWyjscie);
			
			menuBar.add(Box.createHorizontalGlue());
			Pomoc = new JMenu("Pomoc");
			
				menuBar.add(Pomoc);
				
				itemJakGrac = new JMenuItem("Jak grać?");
				itemJakGrac.addActionListener(this);
				Pomoc.add(itemJakGrac);
				
				itemOProgramie = new JMenuItem("O programie");
				itemOProgramie.addActionListener(this);
				Pomoc.add(itemOProgramie);
				
			add(menuBar);
			setJMenuBar(menuBar);	
			
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension dim = tk.getScreenSize();
			int posX = (dim.width/2)-(this.getWidth()/2);
			int posY = (dim.height/2)-(this.getHeight()/2);
			this.setLocation(posX, posY);
			this.setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panel.setLayout(new GridLayout(3,3)); // 3 kolumny 3 wiersze tego samego rozmiaru
			
			for (int i = 0;i<9;i++){
				buttons[i] = new XOButton();
				panel.add(buttons[i]);
			}
			
			add(panel);

			
			setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
}
