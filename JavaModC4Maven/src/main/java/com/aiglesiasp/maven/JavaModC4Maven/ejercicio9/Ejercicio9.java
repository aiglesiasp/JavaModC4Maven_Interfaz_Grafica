/**
 * 
 */
package com.aiglesiasp.maven.JavaModC4Maven.ejercicio9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
/**
 * @author aitor
 *
 */
public class Ejercicio9 extends JFrame{
	
	private JPanel contentPane;
	
	public Ejercicio9() {
		setTitle("EJERCICIO 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtn1 = new JToggleButton("boton1");
		tglbtn1.setBounds(10, 10, 120, 120);
		tglbtn1.addItemListener(al);
		contentPane.add(tglbtn1);
		
		JToggleButton tglbtn2 = new JToggleButton("boton2");
		tglbtn2.setBounds(140, 10, 120, 120);
		tglbtn2.addItemListener(al);
		contentPane.add(tglbtn2);
		
		JToggleButton tglbtn3 = new JToggleButton("boton3");
		tglbtn3.setBounds(270, 10, 120, 120);
		tglbtn3.addItemListener(al);
		contentPane.add(tglbtn3);
		
		JToggleButton tglbtn4 = new JToggleButton("boton4");
		tglbtn4.setBounds(400, 10, 120, 120);
		tglbtn4.addItemListener(al);
		contentPane.add(tglbtn4);
		
		JToggleButton tglbtn5 = new JToggleButton("boton5");
		tglbtn5.setBounds(10, 140, 120, 120);
		tglbtn5.addItemListener(al);
		contentPane.add(tglbtn5);
		
		JToggleButton tglbtn6 = new JToggleButton("boton6");
		tglbtn6.setBounds(140, 140, 120, 120);
		tglbtn6.addItemListener(al);
		getContentPane().add(tglbtn6);
		
		JToggleButton tglbtn7 = new JToggleButton("boton7");
		tglbtn7.setBounds(270, 140, 120, 120);
		tglbtn7.addItemListener(al);
		contentPane.add(tglbtn7);
		
		JToggleButton tglbtn8 = new JToggleButton("boton8");
		tglbtn8.setBounds(400, 140, 120, 120);
		tglbtn8.addItemListener(al);
		contentPane.add(tglbtn8);
		
		JToggleButton tglbtn9 = new JToggleButton("boton9");
		tglbtn9.setBounds(10, 270, 120, 120);
		tglbtn9.addItemListener(al);
		contentPane.add(tglbtn9);
		
		JToggleButton tglbtn10 = new JToggleButton("boton10");
		tglbtn10.setBounds(140, 270, 120, 120);
		tglbtn10.addItemListener(al);
		contentPane.add(tglbtn10);
		
		JToggleButton tglbtn11 = new JToggleButton("boton11");
		tglbtn11.setBounds(270, 270, 120, 120);
		tglbtn11.addItemListener(al);
		contentPane.add(tglbtn11);
		
		JToggleButton tglbtn12 = new JToggleButton("boton12");
		tglbtn12.setBounds(400, 270, 120, 120);
		tglbtn12.addItemListener(al);
		contentPane.add(tglbtn12);
		
		JToggleButton tglbtn13 = new JToggleButton("boton13");
		tglbtn13.setBounds(10, 400, 120, 120);
		tglbtn13.addItemListener(al);
		contentPane.add(tglbtn13);
		
		JToggleButton tglbtn14 = new JToggleButton("boton14");
		tglbtn14.setBounds(140, 400, 120, 120);
		tglbtn14.addItemListener(al);
		contentPane.add(tglbtn14);
		
		JToggleButton tglbtn15 = new JToggleButton("boton15");
		tglbtn15.setBounds(270, 400, 120, 120);
		tglbtn15.addItemListener(al);
		contentPane.add(tglbtn15);
		
		JToggleButton tglbtn16 = new JToggleButton("boton16");
		tglbtn16.setBounds(400, 400, 120, 120);
		tglbtn16.addItemListener(al);
		contentPane.add(tglbtn16);
		
		setVisible(true);
	}
	
	// ACTION LISTENER
		ItemListener al = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				JToggleButton botonpressed = (JToggleButton) e.getSource();
				int estado = e.getStateChange();
				if(estado == ItemEvent.SELECTED){
                    botonpressed.setText("Botón seleccionado");
                    botonpressed.setBackground(Color.RED);
                } else {
                	botonpressed.setText("Botón deseleccionado");
                }
				
			}
			
		};
		
	
	
}
