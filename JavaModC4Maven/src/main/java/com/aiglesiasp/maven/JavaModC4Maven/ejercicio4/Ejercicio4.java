/**
 * 
 */
package com.aiglesiasp.maven.JavaModC4Maven.ejercicio4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * @author aitor
 *
 */
public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JLabel lblEventos;
	private JTextArea textArea;

	public Ejercicio4() {
		setTitle("EJERCICIO 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(mouse);

		lblEventos = new JLabel("EVENTOS");
		lblEventos.addMouseListener(mouse);
		lblEventos.setBounds(19, 142, 61, 16);
		contentPane.add(lblEventos);

		textArea = new JTextArea();
		textArea.setBounds(100, 6, 344, 285);
		textArea.addMouseListener(mouse);
		contentPane.add(textArea);
		textArea.append("Se ha creado la venta y el panel");
		textArea.append(System.getProperty("line.separator"));
		textArea.append("Se ha creado el label Eventos");
		textArea.append(System.getProperty("line.separator"));
		textArea.append("Se ha creado el text Area");
		textArea.append(System.getProperty("line.separator"));

		setVisible(true);
	}

	// MOUSE ADAPTER
	MouseAdapter mouse = new MouseAdapter() {
		public void mouseReleased(MouseEvent e) {
			if (e.getSource() == lblEventos) {
				textArea.append("Se ha clicado en el label Eventos");
				textArea.append(System.getProperty("line.separator"));
			}
			// SI PULSA BOTON -
			if (e.getSource() == textArea) {
				textArea.append("Se ha clicado en el TextArea");
				textArea.append(System.getProperty("line.separator"));
			}
			if (e.getSource() == contentPane) {
				textArea.append("Se ha clicado en la ventana");
				textArea.append(System.getProperty("line.separator"));
			}
		}

	};

}
