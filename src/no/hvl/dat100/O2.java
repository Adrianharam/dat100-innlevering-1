package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import java.util.Scanner;

import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {

String Lønn= showInputDialog("Hva var bruttolønnen din?");
double brutto = parseInt(Lønn);

 if (brutto >= 208051 && brutto <=292850)
	 System.out.println("Du må betale " + brutto*0.017 + " i skatt");
if (brutto>=292851 && brutto<=670000)
	System.out.println("Du må betale " + brutto*0.04 + " i skatt" );
if (brutto>=670001 && brutto<=937900)
	System.out.println("Du må betale " + brutto*0.136 + " i skatt" );
if (brutto>=937901 && brutto<=1350000)

	System.out.println("Du må betale " + brutto*0.166 + " i skatt" );
if (brutto>= 1350001)
	System.out.println("Du må betale " + brutto*0.176 + " i skatt" );

	}}
			
