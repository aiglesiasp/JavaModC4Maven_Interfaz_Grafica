/**
 * 
 */
package com.aiglesiasp.maven.JavaModC4Maven.ejercicio9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author aitor
 *
 */
public class Ejercicio9 extends JFrame {

	private JPanel contentPane;
	public int primerClick;
	public int segundoClick;
	public int contador = 0;
	public int contadorPalabras = 0;
	public JToggleButton tglbtn1, tglbtn2, tglbtn3, tglbtn4, tglbtn5, tglbtn6, tglbtn7, tglbtn8, tglbtn9, tglbtn10, tglbtn11, tglbtn12, tglbtn13, tglbtn14, tglbtn15, tglbtn16;
	public ArrayList<JToggleButton> btnsTotales = new ArrayList<>();
	public ArrayList<String> listaPalabras = new ArrayList<>();
	public ArrayList<String> palabrasUsadas = new ArrayList<>();

	public Ejercicio9() {
		setTitle("EJERCICIO 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		generarPalabras();
		

		tglbtn1 = new JToggleButton();
		tglbtn1.setBounds(10, 10, 120, 120);
		btnsTotales.add(tglbtn1);
		contentPane.add(tglbtn1);

		tglbtn2 = new JToggleButton();
		tglbtn2.setBounds(140, 10, 120, 120);
		btnsTotales.add(tglbtn2);
		contentPane.add(tglbtn2);

		tglbtn3 = new JToggleButton();
		tglbtn3.setBounds(270, 10, 120, 120);
		btnsTotales.add(tglbtn3);
		contentPane.add(tglbtn3);

		tglbtn4 = new JToggleButton();
		tglbtn4.setBounds(400, 10, 120, 120);
		btnsTotales.add(tglbtn4);
		contentPane.add(tglbtn4);

		tglbtn5 = new JToggleButton();
		tglbtn5.setBounds(10, 140, 120, 120);
		btnsTotales.add(tglbtn5);
		contentPane.add(tglbtn5);

		tglbtn6 = new JToggleButton();
		tglbtn6.setBounds(140, 140, 120, 120);
		btnsTotales.add(tglbtn6);
		getContentPane().add(tglbtn6);

		tglbtn7 = new JToggleButton();
		tglbtn7.setBounds(270, 140, 120, 120);
		btnsTotales.add(tglbtn7);
		contentPane.add(tglbtn7);

		tglbtn8 = new JToggleButton();
		tglbtn8.setBounds(400, 140, 120, 120);
		btnsTotales.add(tglbtn8);
		contentPane.add(tglbtn8);

		tglbtn9 = new JToggleButton();
		tglbtn9.setBounds(10, 270, 120, 120);
		btnsTotales.add(tglbtn9);
		contentPane.add(tglbtn9);

		tglbtn10 = new JToggleButton();
		tglbtn10.setBounds(140, 270, 120, 120);
		btnsTotales.add(tglbtn10);
		contentPane.add(tglbtn10);

		tglbtn11 = new JToggleButton();
		tglbtn11.setBounds(270, 270, 120, 120);
		btnsTotales.add(tglbtn11);
		contentPane.add(tglbtn11);

		tglbtn12 = new JToggleButton();
		tglbtn12.setBounds(400, 270, 120, 120);
		btnsTotales.add(tglbtn12);
		contentPane.add(tglbtn12);

		tglbtn13 = new JToggleButton();
		tglbtn13.setBounds(10, 400, 120, 120);
		btnsTotales.add(tglbtn13);
		contentPane.add(tglbtn13);

		tglbtn14 = new JToggleButton();
		tglbtn14.setBounds(140, 400, 120, 120);
		btnsTotales.add(tglbtn14);
		contentPane.add(tglbtn14);

		tglbtn15 = new JToggleButton();
		tglbtn15.setBounds(270, 400, 120, 120);
		btnsTotales.add(tglbtn15);
		contentPane.add(tglbtn15);

		tglbtn16 = new JToggleButton();
		tglbtn16.setBounds(400, 400, 120, 120);
		btnsTotales.add(tglbtn16);
		contentPane.add(tglbtn16);

		for (int i = 0; i< btnsTotales.size(); i++) {
				
				btnsTotales.get(i).addActionListener(al);
				
		}

		setVisible(true);
	}

	// ACTION LISTENER
	ActionListener al = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i = 0; i < btnsTotales.size(); i++) {
				if(btnsTotales.get(i) == e.getSource()) {
					if(btnsTotales.get(i).isSelected()) {
						if(btnsTotales.get(i).getText().isEmpty()) {
							btnsTotales.get(i).setText(palabraAleatoria());
						} else {
							btnsTotales.get(i).setText(btnsTotales.get(i).getText());
						}
						
						btnsTotales.get(i).setText(palabraAleatoria());
					} else {
						btnsTotales.get(i).setText("");
						//btnsTotales.get(i).setVisible(isEnabled());
						//btnsTotales.get(i).getAccessibleContext().getAccessibleText().toString();
					}
				}
				
			}
			
		}

	};
	
	
	public void generarPalabras() {
		listaPalabras.add("MONO");
		listaPalabras.add("OVEJA");
		listaPalabras.add("COCODRILO");
		listaPalabras.add("PERRO");
		listaPalabras.add("GATO");
		listaPalabras.add("LOBO");
		listaPalabras.add("ZORRO");
		listaPalabras.add("LEON");
	}
	
	public String palabraAleatoria() {
		String palabra = "";
		boolean incorrecto = true;
		int random = (int) (Math.random()*8);
		contador = 0;
		do {
			palabra = listaPalabras.get(random);
			if(palabrasUsadas.size()== 0) {
				palabrasUsadas.add(palabra);
				incorrecto = false;
			}
			else {
				for(int i = 0; i< palabrasUsadas.size(); i++) {
					if(palabra == palabrasUsadas.get(i)) {
						contador++;
					}
				}
				if(contador >=2) {
					incorrecto = true;
					contador = 0;
				} else {
					incorrecto = false;
					palabrasUsadas.add(palabra);
				}
			}
			
		} while(incorrecto);
		
		return palabra;
	}


}
