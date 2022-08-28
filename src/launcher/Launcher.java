package launcher;

import entities.Student;
import gui.*;

public class Launcher {
	private static Student studentData;
	private static SimplePresentationScreen frame;
	
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	studentData= new Student(122170, "Panzone", "Lourdes", "lourdespanzone@gmail.com", "https://github.com/lourdes-P", "/images/foto_student.png");
            	
            	frame= new SimplePresentationScreen(studentData);
            	frame.setVisible(true);
            }
        });
    }
}