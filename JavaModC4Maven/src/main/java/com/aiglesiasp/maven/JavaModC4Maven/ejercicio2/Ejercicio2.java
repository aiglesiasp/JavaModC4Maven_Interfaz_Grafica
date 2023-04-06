/**
 * 
 */
package com.aiglesiasp.maven.JavaModC4Maven.ejercicio2;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author aitor
 *
 */
public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JLabel etiqueta;
	private JButton boton1;
	private JButton boton2;

	public Ejercicio2() {
		setTitle("EJERCICIO 2");
		setBounds(400, 200, 700, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		etiqueta = new JLabel("No has pulsado nada");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setBounds(6, 25, 147, 20);
		contentPane.add(etiqueta);

		boton1 = new JButton("Boton 1");
		boton1.addActionListener(al);
		boton1.setBounds(229, 22, 117, 29);
		contentPane.add(boton1);

		boton2 = new JButton("Boton 2");
		boton2.addActionListener(al);
		boton2.setBounds(417, 22, 117, 29);
		contentPane.add(boton2);

		setVisible(true);
	}

	// ACTION LISTENER
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// SI PULSA BOTON 1
			if (e.getSource() == boton1) {
				etiqueta.setText("Pulsaste el BOTON 1");
			}
			// SI PULSA BOTON 2
			if (e.getSource() == boton2) {
				etiqueta.setText("Pulsaste el BOTON 2");
			}
		}
	};

}
