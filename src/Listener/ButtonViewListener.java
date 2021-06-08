package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.WeekPlanVeiwer;
import GUI.Windowframe;
import Manager.WeekPlanManager;

public class ButtonViewListener implements ActionListener {
	Windowframe f;
	
	public ButtonViewListener(Windowframe f) {
		this.f = f;
	}

	
	public void actionPerformed(ActionEvent e) {
		WeekPlanVeiwer wv = f.getWv();
		WeekPlanManager weekplanmanager = getobject("weekplanmanager.ser");
		wv.setW(weekplanmanager);
		
		f.getContentPane().removeAll();
		f.getContentPane().add(wv);
		f.revalidate();
		f.repaint();
		
	}
	public static WeekPlanManager getobject(String filename) {
		WeekPlanManager weekplanmanager = null;
		
		
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			 weekplanmanager=(WeekPlanManager)in.readObject();
			 in.close();
			 file.close();
		} catch (FileNotFoundException e) {
			return weekplanmanager;
		}
		 catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return weekplanmanager;
	}
	

}
