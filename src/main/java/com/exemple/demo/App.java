package com.exemple.demo;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	int x, y, sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le premier nombre: ");
		x = sc.nextInt();
		System.out.println("Entrez le second nombre: ");
		y = sc.nextInt();

		sum = x + y;

		System.out.println("La somme des deux nombres saisie est : " + sum);
    }

}	
