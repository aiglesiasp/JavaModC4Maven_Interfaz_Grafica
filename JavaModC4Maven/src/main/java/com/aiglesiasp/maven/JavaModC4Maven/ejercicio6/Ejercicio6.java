package com.aiglesiasp.maven.JavaModC4Maven.ejercicio6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio6 extends JFrame {

	private JPanel contentPane;
	private JTextField fieldAltura;
	private JTextField fieldPeso;
	private JTextField fieldIMC;

	public Ejercicio6() {
		setTitle("EJERCICIO 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ETIQUETAS ALTURA - PESO
		JLabel etiquetaAltura = new JLabel("Altura (metros)");
		etiquetaAltura.setBounds(22, 21, 103, 16);
		contentPane.add(etiquetaAltura);

		JLabel etiquetaPeso = new JLabel("Peso (kg)");
		etiquetaPeso.setBounds(255, 21, 61, 16);
		contentPane.add(etiquetaPeso);

		// TEXT FIELD ALTURA - PESO
		fieldAltura = new JTextField();
		fieldAltura.setBounds(122, 16, 97, 26);
		contentPane.add(fieldAltura);
		fieldAltura.setColumns(10);

		fieldPeso = new JTextField();
		fieldPeso.setColumns(10);
		fieldPeso.setBounds(328, 16, 97, 26);
		contentPane.add(fieldPeso);

		// ETIQUETA IMC
		JLabel etiquetaIMC = new JLabel("IMC: ");
		etiquetaIMC.setBounds(255, 70, 61, 16);
		contentPane.add(etiquetaIMC);

		// FIELD IMC
		fieldIMC = new JTextField();
		fieldIMC.setColumns(10);
		fieldIMC.setBounds(328, 65, 97, 26);
		contentPane.add(fieldIMC);

		// BOTON PARA CALCULAR
		JButton btnCalcularIMC = new JButton("Calcular IMC");
		btnCalcularIMC.addActionListener(al);
		btnCalcularIMC.setBounds(102, 65, 117, 29);
		contentPane.add(btnCalcularIMC);

		setVisible(true);
	}

	// ACTION LISTENER
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			double altura = Double.parseDouble(fieldAltura.getText());
			double peso = Double.parseDouble(fieldPeso.getText());
			double res = peso / Math.pow(altura, 2);
			double resFinal = Math.round(res * 100.0) / 100.0;
			fieldIMC.setText("" + resFinal);
		}
	};
}
