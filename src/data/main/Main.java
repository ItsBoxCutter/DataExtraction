package data.main;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Main implements ActionListener {
	public static Main main;
	public static Renderer renderer;
	
	public static final int WIDTH = 800, HEIGHT = 800;
	
	public Main(){
		JFrame frame = new JFrame("Data Extraction");
		
		renderer = new Renderer();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(renderer);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args){
		main = new Main();
	}
	public void update(){
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public void render(Graphics g){
		
	}
}
