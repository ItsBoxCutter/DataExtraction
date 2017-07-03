package data.main;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel{
	private static final long serialVersionUID = 1L;
	public Renderer(){
		setPreferredSize(new Dimension(Main.WIDTH, Main.HEIGHT));
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Main.main.render(g);
	}
	
}
