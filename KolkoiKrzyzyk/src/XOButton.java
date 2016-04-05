import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XOButton extends JButton implements ActionListener{
	
	ImageIcon X,O;
	int value = 0;
	/*
	 * 0:nothing
	 * 1:X
	 * 2:0
	 */

	public XOButton(){
		X = new ImageIcon(this.getClass().getResource("X.png"));
		O = new ImageIcon(this.getClass().getResource("Y.png"));
		
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		value ++;
		value%=3;
		
		switch(value){
			
		}
	}
	
}
