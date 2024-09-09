package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import java.util.Scanner;

import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fakultet= showInputDialog("Hva er det naturlige tallet ditt?");
		int n = parseInt(fakultet);
		
		int sum = 1;
		for(int f = 1; f<=n ;f++) {
			
			sum = sum*f ;}
			
		System.out.println(sum);		
			
			
			
	}

}

