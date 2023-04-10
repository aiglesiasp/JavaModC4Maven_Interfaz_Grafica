package com.aiglesiasp.maven.JavaModC4Maven;

import java.awt.EventQueue;

import com.aiglesiasp.maven.JavaModC4Maven.ejercicio1.Ejercicio1;
import com.aiglesiasp.maven.JavaModC4Maven.ejercicio2.Ejercicio2;
import com.aiglesiasp.maven.JavaModC4Maven.ejercicio3.Ejercicio3;
import com.aiglesiasp.maven.JavaModC4Maven.ejercicio4.Ejercicio4;
import com.aiglesiasp.maven.JavaModC4Maven.ejercicio5.Ejercicio5;
import com.aiglesiasp.maven.JavaModC4Maven.ejercicio6.Ejercicio6;
import com.aiglesiasp.maven.JavaModC4Maven.ejercicio7.Ejercicio7;
import com.aiglesiasp.maven.JavaModC4Maven.ejercicio8.Ejercicio8;
import com.aiglesiasp.maven.JavaModC4Maven.ejercicio9.Ejercicio9;

import bootcamp.M4.Team1_Juego_del_ahorcado.controllers.WelcomeController;
import bootcamp.M4.Team1_Juego_del_ahorcado.views.WelcomeView;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 ej = new Ejercicio1();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
