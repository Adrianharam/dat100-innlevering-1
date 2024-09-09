package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import java.util.Scanner;

import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
		String gradering= showInputDialog("Hvor mange poeng fikk du på prøven?");
		int karakter = parseInt(gradering);
		if (karakter >= 90 && karakter<=100)
			System.out.println("Student " + i +" fikk karakter A");
		else if (karakter>=80 && karakter<90) 
			System.out.println("Student " + i +" fikk karakter B");
		else if (karakter<80 && karakter >=60) 
			System.out.println("Student " + i +" fikk karakter C");
		else if (karakter<60 && karakter >=50) 
				System.out.println("Student " + i +" fikk karakter D");
		else if (karakter<50 && karakter >=40) 
			System.out.println("Student " + i +" fikk karakter E");
		else if (karakter<40 && karakter >=0) 
			System.out.println("Student " + i +" fikk karakter F");
		else {
			System.out.println("ugyldig karakter prøv på nytt");
			i = i - 1;}
		}
		}}
