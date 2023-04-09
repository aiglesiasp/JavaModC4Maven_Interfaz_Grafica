/**
 * 
 */
package com.aiglesiasp.maven.JavaModC4Maven.ejercicio4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * @author aitor
 *
 */
public class Ejercicio4 extends JFrame implements WindowListener {

	private JPanel contentPane;
	private JTextArea textArea;

	public Ejercicio4() {
		setTitle("EJERCICIO 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		addWindowListener(this);

		JLabel lblEventos = new JLabel("EVENTOS");
		lblEventos.setBounds(19, 142, 61, 16);
		contentPane.add(lblEventos);

		textArea = new JTextArea();
		textArea.setBounds(100, 6, 344, 285);
		textArea.setRows(20);
		contentPane.add(textArea);

		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		textArea.append("Se ha abierto la ventana\n");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		textArea.append("Se esta cerrando la ventana\n");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		textArea.append("Se ha cerrado la ventana\n");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		textArea.append("Se ha minimizado la ventana\n");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		textArea.append("Se ha restaurado la ventana\n");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		textArea.append("Se ha activado la ventana\n");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		textArea.append("Se ha desactivado la ventana\n");

	}

//	// MOUSE ADAPTER
//	MouseAdapter mouse = new MouseAdapter() {
//		public void mouseReleased(MouseEvent e) {
//			// Pulsa en LABEL
//			if (e.getSource() == lblEventos) {
//				textArea.append("Se ha clicado en el label Eventos");
//				textArea.append(System.getProperty("line.separator"));
//			}
//			// Pulsa en TextArea
//			if (e.getSource() == textArea) {
//				textArea.append("Se ha clicado en el TextArea");
//				textArea.append(System.getProperty("line.separator"));
//			}
//			// Pulsa en panel
//			if (e.getSource() == contentPane) {
//				textArea.append("Se ha clicado en la ventana");
//				textArea.append(System.getProperty("line.separator"));
//			}
//		}
//
//	};

}
