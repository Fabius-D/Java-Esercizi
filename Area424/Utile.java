public class Utile{// classe con soli metodi(la cassetta degli attrezzi).
    // metodo del cerca porta
    public int cercaPorta(int[] codici , int codiceInserito){// qui abbiamo un array di 
    // interi(codici) e una variabile che conterrà il numero da inserire(codiceInserito).
        for (int i = 0; i < codici.length;i++){// qui scorriamo l'array indice dopo indice
            if (codici[i] == codiceInserito){// se il valore di i  è uguale a quello da cercare
                return i;// allora lo abbiamo trovato ci restituisce la posizione dell'indice.
            }
        }
        return -1;// Non trovato / Non pervenuto
    }

    // metodo del conta porte attive
    public int contaPorteAttive(boolean[] attiva){
        int conta = 0; // inizializziamo la variabile contatore a zero
        for (int i = 0; i < attiva.length;i++){// scorriamo tutto l'array
            if (attiva[i] == true){ // se il valore dell'array e uguale a true aumenta di 1
                conta++;
            }
        }
        return conta;
    }

    // metodo del stampa porte guaste
    public void stampaPorteGuaste(boolean[] guaste){
        for (int i = 0; i < guaste.length; i++){
            if (guaste[i] == true){
                System.out.println(" La porta: " + i + " è guasta");
            }
        }
    }

    // metodo del conta porte guaste
    public int contaLePorteGuaste(boolean[] inattive){
        int contaPorte = 0; // inizializziamo la variabile 
        for (int i =0; i < inattive.length;i++){
            if (inattive[i] == true){
                contaPorte++;
            }
        }
        return contaPorte;
    }

    // metodo del cerca prima porta guasta
    public void primaPortaGuasta(boolean[] rotta){
        for(int i = 0; i < rotta.length;i++){
            if (rotta[i] == true){
                System.out.println("La porta gusta è stata trovata all'indice " + i);
                break;
            }
        }
    }

    // metodo del trova almeno una porta guasta
    public void almenoUnaPortaGuasta(boolean[] bloccata){
        boolean trovato = false;// impostiamo la variabile a nessuna porta trovata all'inizio
        for (int i = 0; i < bloccata.length; i++){
            if (bloccata[i] == true){// se l'arrey trova una porta gusta 
                trovato = true;// allora la variabile trova cambia idea
                break;// e si stoppa immediatamente senza andare oltre
            }
        }
        if (trovato){
            System.out.println("Attenzione porta guasta trovata");
        } else{
            System.out.println("Tutte le porte sono operative");
        }

    }

    // metodo del trova uscita di emergenza
    public void trovaPortaEmergenza(boolean[] uscita){
        boolean cerca = false;// nessuna porta trovata per il momento
        // scorriamo l'array per cercare le porte
        for (int i = 0; i < uscita.length;i++){
            if (uscita[i] == true){// se ce un porta d'uscita
                cerca = true;// allora abbiamo trovato l'uscita(qindi è vero ce una porta)
                break;
            }
        }
        if (cerca){
            System.out.println("Uscita trovata siamo salvi");
        }else{
            System.out.println("Porte non funzionanti siamo nei guai");
        }
    }

    // metodo del cerca temperatura superiore di 30
    public void cercaTemperaturaSuperiore(int[] temperature){
        for(int i = 0; i <temperature.length;i++){// cerchiamo tutte le temperature
            if (temperature[i] > 30){
                // ho usato la stampa perche è void (quindi no si mette un contatore all'inizio)
                System.out.println("Le temperature superiori a trenta sono all'indice: " + i);
            }
        }
    }
}