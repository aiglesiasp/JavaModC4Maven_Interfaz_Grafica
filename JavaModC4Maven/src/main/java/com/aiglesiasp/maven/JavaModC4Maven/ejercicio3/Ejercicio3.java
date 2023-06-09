package com.aiglesiasp.maven.JavaModC4Maven.ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JLabel etiquetaBoton1;
	private JLabel etiquetaBoton2;
	private int countBoton1 = 0;
	private int countBoton2 = 0;
	private JButton boton1;
	private JButton boton2;

	public Ejercicio3() {
		setTitle("EJERCICIO 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		boton1 = new JButton("Boton 1");
		boton1.addActionListener(al);
		contentPane.setLayout(null);
		boton1.setBounds(84, 45, 92, 29);
		contentPane.add(boton1);

		etiquetaBoton1 = new JLabel("Boton 1: " + countBoton1 + " veces");
		etiquetaBoton1.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaBoton1.setBounds(84, 16, 103, 16);
		contentPane.add(etiquetaBoton1);

		etiquetaBoton2 = new JLabel("Boton 2: " + countBoton2 + " veces");
		etiquetaBoton2.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaBoton2.setBounds(227, 16, 103, 16);
		contentPane.add(etiquetaBoton2);

		boton2 = new JButton("Boton 2");
		boton2.addActionListener(al);
		boton2.setBounds(227, 45, 92, 29);
		contentPane.add(boton2);

		setVisible(true);
	}

	// ACTION LISTENER
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// SI PULSA BOTON 1
			if (e.getSource() == boton1) {
				countBoton1++;
				etiquetaBoton1.setText("Boton 1: " + countBoton1 + " veces");
			}
			// SI PULSA BOTON 2
			if (e.getSource() == boton2) {
				countBoton2++;
				etiquetaBoton2.setText("Boton 2: " + countBoton2 + " veces");
			}
		}
	};

}
