package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonAddcancelListener implements ActionListener {
	Windowframe f;
	
	public ButtonAddcancelListener(Windowframe f) {
		this.f = f;
	}

	
	public void actionPerformed(ActionEvent e) {
		
		f.getContentPane().removeAll();
		f.getContentPane().add(f.getMs());
		f.revalidate();
		f.repaint();
		
	}

}
