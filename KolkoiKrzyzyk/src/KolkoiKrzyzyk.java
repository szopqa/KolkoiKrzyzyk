import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GridLayout;

public class KolkoiKrzyzyk extends JFrame{

	JPanel panel = new JPanel();
	XOButton buttons [] = new XOButton [9]; 
	JMenuBar menuBar;
	JMenu Plik,Informacje;
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
				
				itemNowaGra = new JMenuItem("Nowa Gra");
				Plik.add(itemNowaGra);
				
				itemWyjscie = new JMenuItem("Wyjście");
				Plik.addSeparator();
				Plik.add(itemWyjscie);
				
			add(menuBar);
				
			
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
	
}
