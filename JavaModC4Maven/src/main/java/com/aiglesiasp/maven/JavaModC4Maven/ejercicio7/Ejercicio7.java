package com.aiglesiasp.maven.JavaModC4Maven.ejercicio7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio7 extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCantidad;
	private JTextField fieldResultado;
	private boolean estado = true;
	private JButton btnConversor;
	private final double EURO = 166.386;
	private JButton btnLimpiar;

	/**
	 * Create the frame.
	 */
	public Ejercicio7() {
		setTitle("EJERCICIO 7"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CANTIDAD
		JLabel labelCantidad = new JLabel("Cantidad a convertir");
		labelCantidad.setBounds(16, 24, 134, 16);
		contentPane.add(labelCantidad);
		
		fieldCantidad = new JTextField();
		fieldCantidad.setBounds(16, 40, 130, 26);
		contentPane.add(fieldCantidad);
		fieldCantidad.setColumns(10);
		
		//REUSLTADO
		JLabel labelResultado = new JLabel("Resultado");
		labelResultado.setBounds(208, 24, 74, 16);
		contentPane.add(labelResultado);
		
		fieldResultado = new JTextField();
		fieldResultado.setColumns(10);
		fieldResultado.setBounds(208, 40, 194, 26);
		contentPane.add(fieldResultado);
		
		btnConversor = new JButton("Euros a ptas");
		btnConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(fieldCantidad.getText());
				double res = 0.0;
				if(estado == true) {
					res = num * EURO;
				} else {
					res = num / EURO;
				}
				fieldResultado.setText(""+res);
			}
		});
		btnConversor.setBounds(113, 85, 117, 29);
		contentPane.add(btnConversor);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estado == true) {
					btnConversor.setText("Ptas a euros");
					estado = false;
				} else {
					btnConversor.setText("Euros a ptas");
					estado = true;
				}
				
			}
		});
		btnCambiar.setBounds(113, 126, 117, 29);
		contentPane.add(btnCambiar);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldResultado.setText("");
				fieldCantidad.setText("");
			}
		});
		btnLimpiar.setBounds(242, 126, 117, 29);
		contentPane.add(btnLimpiar);
		
		
		setVisible(true);
	}

}