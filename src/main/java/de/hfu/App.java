package de.hfu;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Text eingabe");
		Scanner input = new Scanner(System.in);
		String eingabe = input.nextLine();
		System.out.println(eingabe.toUpperCase());
    }
}
