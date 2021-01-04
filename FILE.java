/*
  [EN]: Create and write on a text file in Java
  [IT]: Creare e scrivere su un file di testo in Java
*/
// 1-st Java program with file

import java.io.File;        // Java file library
import java.io.IOException;       // Java exception library
import java.io.PrintWriter;       // ci permette di scrivere nel file di testo creato
import java.io.FileOutputStream;      // libreria contenente funzioni per scrivere su un file GIA' ESISTENTE

public class FileDiTesto{

  public static void main(String[] args) throws IOException{
  
    File f = new File("test.txt");
  
   
    // verificare l'esistenza del file
    
    if(f.exists()){
      
      FileOutputStream fos = new FileOutputStream("test.txt", true);
      PrintWriter scrivi = new PrintWriter(fos);
      scrivi.append("Hello AGAIN!");
      scrivi.close(fos);
      
      System.out.println("Il file esiste!");
    } else if(f.createNewFile()){                     // Java fa i capricci e ci suggerisce delle soluzioni -> adottiamo il suggerimento con le eccezioni
      
      PrintWriter scrivi = new PrintWriter(f);
      scrivi.println("I'm a test! Hello WORLD!");
      scrivi.close(f);
      System.out.println("ERRORE: Il file NON esiste!");
    }
    
  }

}
