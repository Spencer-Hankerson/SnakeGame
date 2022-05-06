package updatedSnakeGame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SnakeFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	SnakeFrame(){
		
		ImageIcon image = new ImageIcon("snake.png");
		this.setIconImage(image.getImage());
		this.add(new SnakePanel());
		this.setTitle("Updated Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}

}
