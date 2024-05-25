/* Project 1 - Christopher Jacqu */
import javax. swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton; 
import javax. swing.JPanel;

import java.awt.Color;
import java.awt.Container; 
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

//----------------------------------------------------------------
// Initial GUI
public class InitialGUI extends JFrame {

    // Dimestions
    private static final int WIDTH = 700;
    private static final int HEIGHT = 100; // grid layout

    // arrays for formatting currenct, percentages, and decimal values

    // define arrays for holding items in cart

    // additional variables as needed


    public InitialGUI() { // Constructor for GUI

        setTitle("nile.com - spring 2024");
    }

}

//----------------------------------------------------------------
// First class
public class Main {

    // Create new instance of class
    JFrame aNewStore = new InitialGUI(); //create frame object
    aNewStore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aNewStore.setVisible(true); //display frame
} // end main
