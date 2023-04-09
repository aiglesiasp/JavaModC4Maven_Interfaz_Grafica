/**
 * 
 */
package com.aiglesiasp.maven.JavaModC4Maven.ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;

/**
 * @author aitor
 *
 */
public class Ejercicio5 extends JFrame {

	private JPanel contentPane;
	private JButton btnLimpiar;
	private JTextArea textArea;

	public Ejercicio5() {
		
		MouseListener mouseEvent = new MouseEvents();

		setTitle("EJERCICIO 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(161, 6, 117, 29);
		btnLimpiar.addActionListener(al);
		contentPane.add(btnLimpiar);

		textArea = new JTextArea();
		textArea.setBounds(6, 44, 438, 372);
		textArea.addMouseListener(mouseEvent);
		contentPane.add(textArea);

		setVisible(true);
	}

	// ACTION LISTENER
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
		}
	};
	
	
	class MouseEvents extends MouseInputAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			textArea.append("El Usuario ha hecho un click\n");
		}
		
		
		@Override
		public void mousePressed(MouseEvent e) {
			super.mouseClicked(e);
			textArea.append("El Usuario esta presionando el raton\n");
		}
		
		
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseClicked(e);
			textArea.append("El Usuario ha soltado el raton\n");
		}
		
		
		@Override
		public void mouseEntered(MouseEvent e) {
			super.mouseClicked(e);
			textArea.append("El Usuario ha entrado en el area de texto\n");
		}
		
		
		@Override
		public void mouseExited(MouseEvent e) {
			super.mouseClicked(e);
			textArea.append("El Usuario ha salido en el area de texto\n");
		}
		
	}
	
}
