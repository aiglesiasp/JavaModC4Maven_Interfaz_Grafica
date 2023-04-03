/**
 * 
 */
package com.aiglesiasp.maven.JavaModC4Maven.ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author aitor
 *
 */
public class Ejercicio1  extends JFrame {
	
	private JPanel contentPane;
	private JLabel etiqueta;
	
	public Ejercicio1() {
		
		setTitle("EJERCICIO 1"); 
		setBounds(400, 200, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Hola Amigo!!");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setBounds(92, 98, 110, 20);
		contentPane.add(etiqueta);
		
		JButton btnMas = new JButton("+");
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int altura = etiqueta.getSize().height+10;
				int anchura = etiqueta.getSize().width+10;
				float font = etiqueta.getFont().getSize2D();
				etiqueta.setSize(anchura, altura);
				etiqueta.setFont(etiqueta.getFont().deriveFont(font+5f));
			}
		});
		btnMas.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnMas.setBounds(81, 202, 40, 40);
		contentPane.add(btnMas);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int altura = etiqueta.getSize().height-10;
				int anchura = etiqueta.getSize().width-10;
				float font = etiqueta.getFont().getSize2D();
				etiqueta.setSize(anchura, altura);
				etiqueta.setFont(etiqueta.getFont().deriveFont(font-5f));
			}
		});
		btnMenos.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnMenos.setBounds(191, 202, 40, 40);
		contentPane.add(btnMenos);
		
		
		setVisible(true);
	}

}
