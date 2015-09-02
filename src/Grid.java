import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Grid {
	
	
	Frame gameFrame;
	
	public Grid()
	{
		gameFrame = initFrame();
		
	}
	
	private Frame initFrame()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int) screenSize.getHeight();
		int width = (int) screenSize.getWidth();
		
		gameFrame = new JFrame();
		gameFrame.setBounds(width * 2/7, height * 1/10, width * 1/2, height * 4/5);
		gameFrame.setVisible(true);
		
		return gameFrame;
	}
	
	
}
