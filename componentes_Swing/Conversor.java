package br.com.aed.componentes_Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;

import java.awt.Color;

@SuppressWarnings("serial")
public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField valor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setResizable(false);
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btnConverter = new JButton("converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Fareheint = Double.parseDouble(valor.getText());
				double celsios = Fareheint - 32 / 1.8;
				String cel = String.valueOf(celsios + "�C");
				valor2.setText(cel);
			}
		});
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(btnConverter, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));

		JLabel lblFahreehint = new JLabel("FAHREEHINT:");
		lblFahreehint.setHorizontalAlignment(SwingConstants.CENTER);
		lblFahreehint.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblFahreehint);

		valor = new JTextField();

		valor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(valor);
		valor.setColumns(10);

		JLabel lblCelsios = new JLabel("Celsios");
		lblCelsios.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelsios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblCelsios);

		valor2 = new JTextField();
		valor2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(valor2);
		valor2.setColumns(10);
	}

}
