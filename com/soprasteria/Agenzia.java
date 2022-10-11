package com.soprasteria;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Agenzia {
    public static void main(String[] args) {
        System.out.println("Benvenuto nell'agenzia di viaggi");
        Scanner scan = new Scanner(System.in);
        System.out.println(" 1 : per organizzare una nuova vacanza");
        System.out.println(" 2 : per uscire");
        String ingressoDestinazione = scan.nextLine();
        switch (ingressoDestinazione) {
        
            case "1":
                System.out.println("Inserisci destinazione: ");
                String destinazione = scan.nextLine();
                System.out.println("Inserisci la data di partenza: (dd/mm/yyyy) ");
                String dataInizio = scan.nextLine();
                System.out.println("Inserisci la data di ritorno:  (dd/mm/yyyy) ");
                String dataFine = scan.nextLine();

                try {
                    Vacanza esempioVacanza = new Vacanza(destinazione, dataInizio , dataFine);
                    System.out.println("Grazie.");
                    System.out.println(esempioVacanza);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (DateTimeParseException e) {
                    System.out.println("Le date non sono state inserite correttamente");
                }
                
            case "2":
                System.out.println("Grazie e arrivederci");
                break;


        }
        
    }
}
