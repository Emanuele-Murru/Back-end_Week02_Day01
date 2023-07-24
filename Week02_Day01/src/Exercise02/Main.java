package Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        while (true) {
        	
            try {
            	
                System.out.println("Inserisci il numero di km percorsi:");
                double kmPercorsi = input.nextDouble();

                if (kmPercorsi <= 0) {
                    throw new IllegalArgumentException("Il numero di km deve essere maggiore di zero");
                }

                System.out.println("Inserisci il numero di litri di carburante consumati:");
                double litriConsumati = input.nextDouble();

                if (litriConsumati == 0) {
                    throw new ArithmeticException("Divisione per zero: litri consumati = 0");
                }

                double kmPerLitro = kmPercorsi / litriConsumati;
                System.out.println("Il consumo dell'auto è di " + kmPerLitro + " km/litro");

                break;
                
            } catch (InputMismatchException e) {
            	
                System.out.println("Input non valido. Inserisci un numero valido.");
                input.nextLine(); // Pulizia del buffer di input
                
            } catch (IllegalArgumentException e) {
            	
                System.out.println(e.getMessage());
                
            } catch (ArithmeticException e) {
            	
                System.out.println("Errore: Divisione per zero. Inserisci un numero di litri diverso da zero.");
                
            }
        }

        System.out.println("Programma terminato.");
        
        input.close();
    }
}
