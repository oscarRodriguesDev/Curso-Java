package br.com.aed.componentes_Swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelTeste {

	/**
	 * Esta classe apresenta diversos stilos de apresenta��o dos componentes
	 * graficos atraves da classe UIManager
	 */

	public static void mudarLook() {
		try {
			// UIManager
			// .setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			// UIManager
			// .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			// UIManager
			// .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		LookAndFeelInfo[] lf = UIManager.getInstalledLookAndFeels();
		for (LookAndFeelInfo lookAndFeelInfo : lf) {
			System.out.println(lookAndFeelInfo);
		}

		JFrame frame = new JFrame();
		LookAndFeelTeste.mudarLook();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(frame, "tire o look dos comentarios e veja o resultado");

	}

}
