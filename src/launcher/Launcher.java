package launcher;

import gui.SimplePresentationScreen;
import entities.Student;
import javax.swing.JFrame; 

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
					SimplePresentationScreen window = new SimplePresentationScreen(new Student(137838, "Maciel", "Iván Emanuel", "ivanemanuelmaciel@gmail.com", "https://github.com/ivanmacieldxz", "../images/tdp.png"));
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }
}