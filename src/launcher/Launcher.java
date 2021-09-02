package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student me = new Student(116479, "Mamani", "Vanesa", "mamani.vanesa111@gmail.com", "https://github.com/VanesaYanet/tdp-proyecto-1", "/images/vanesa.png");
            	SimplePresentationScreen app = new SimplePresentationScreen(me);
            	app.setVisible(true);
            }
        });
    }
}