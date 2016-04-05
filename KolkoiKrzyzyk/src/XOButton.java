import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XOButton extends JButton implements ActionListener{
	ImageIcon X,O;
	byte klik=0;
	/*
	0:nic
	1:X
	2:O
	*/
	
	public XOButton(){
		X=new ImageIcon(this.getClass().getResource("X.png"));
		O=new ImageIcon(this.getClass().getResource("O.png"));
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		klik++;
		klik%=3;
		switch(klik){
			case 0:
				setIcon(null);
				break;
			case 1:
				setIcon(X);
				break;
			case 2:
				setIcon(O);
				break;
		}
	}
}