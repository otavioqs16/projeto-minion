package iftm;

import java.awt.Color;

import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela(){
		this.setBounds(400, 200, 900, 850);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Minion");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.criaComponentes();
		this.setVisible(true);
	
	}
	
	private void criaComponentes(){
		Quadro q = new Quadro();
		q.setBackground(Color.DARK_GRAY);
		q.setBounds(0, 0, 900, 850);
		this.add( q );
		
		
		
		
	}
	
}
