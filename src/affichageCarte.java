import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class affichageCarte extends JFrame {
	 private int taille;
	
	
	
	public affichageCarte(){
	
		taille = 800;
	/*Fenetre*/
	BorderLayout b = new BorderLayout();
	setLayout(b);
	/*TOP*/
	JPanel top = new JPanel();
	top.setLayout(new GridLayout(1,2));
	add(top,b.NORTH);
	top.add(new JLabel("haut gauche"));
	top.add(new JLabel("haut droite"));

	/*Button Droite*/
	JButton droite = new JButton("West");
	add(droite,b.WEST);
	/*Image centre*/
	JPanel millieu = new JPanel();
	millieu.setBackground(Color.pink);
	add(millieu,b.CENTER);
	/*Button Gauche*/
	JButton gauche = new JButton("Est");
	add(gauche,b.EAST);
	/*Texte Bas*/
	JLabel bas = new JLabel("Bas ?");
	add(bas,b.SOUTH);



	setSize(taille, taille);
	setVisible(true);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
