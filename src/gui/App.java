package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {
	
	public static void main(String[] args) {
		JFrame window;
		JPanel panel;
		JTextField celTextField, fahTextField;
		panel = new JPanel();//layout mặc định
		celTextField = new JTextField("0.0", 10);//10 cột
		panel.add(celTextField);
		
		window = new JFrame();
		window.setTitle("Cửa sổ nè!!!!");
		window.setSize(400, 400);
		window.add(celTextField);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
