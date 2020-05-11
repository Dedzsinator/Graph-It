import javax.swing.JFrame;

import grapher.Window;
import grapher.parser.ExpressionParser;
import grapher.parser.TokenString;

public class Main {
	public static void main(String[] args) {
		Window window = new Window();
		
		JFrame frame = new JFrame("Function Grapher");
		frame.add(window);
		frame.setResizable(false);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		new Thread(window).start();
	}
}
