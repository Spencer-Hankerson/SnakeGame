package updatedSnakeGame;

import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private JButton playButton;
	private JButton quitButton;

	MenuPanel(){
		playButton = new JButton("Play");
		quitButton = new JButton("Quit");
		
		add(playButton);
		add(quitButton);
			
		playButton.addActionListener(new PlayButtonListener());
		
		
		
		this.setVisible(true);

		}
	public class PlayButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}
	}

}
