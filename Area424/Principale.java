import java.util.Scanner;
public class Principale{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Utile ut = new Utile();
        // prova del metodo del cerca porta
        int [] codice = {1234,2456,4889,2345,5678,8345,7890};// codice delle porte da cercare
        int codiceTrovato = ut.cercaPorta(codice, 7890);
        System.out.println("Il codice è stato trovato all'indice " + codiceTrovato + " prego entra");

        // prova del metodo del cerca porte attive
        boolean [] attive = {false,true,false,true,false,true};
        int totaleAttive = ut.contaPorteAttive(attive);
        System.out.println(" Le porte attive sono: " + totaleAttive);

        // prova del metodo del stampa porte guaste
        boolean [] guaste = {false,true,false,false,true,true,false,true};
        ut.stampaPorteGuaste(guaste);

        // prova del metodo del conta porte guaste
        boolean[] inattive = {false,true,false,false,false,true,true,true,false,true,true,false,false};
        int totaleGuaste = ut.contaLePorteGuaste(inattive);
        System.out.println("Le porte guaste sono in totale: " + totaleGuaste);

        // prova del medoto del cerca prima porta gusta
        boolean [] sequenze = {false,false,false,false,false,true,true,true};
        ut.primaPortaGuasta(sequenze);

        // prova del metodo del trova almeno una porta guasta
        boolean[] sequenza1 = {false,false,true,false,false};
        ut.almenoUnaPortaGuasta(sequenza1);

        // prova del metodo trova uscita di emergenza
        boolean[] sequenza2 = {false,false,false,false,false};
        ut.trovaPortaEmergenza(sequenza2);

        // prova del metodo del cerca temperatura superiore
        int[] sequenza3 = {10,12,21,23,32,38,40};// sequenza di numeri interi perche è un array di interi
        ut.cercaTemperaturaSuperiore(sequenza3);// essendo void richiamiamo il metodo senza metterlo in una scatola
        






































    }

}