/*
  [EN]: reading a text file in Java
  [IT]: lettura un file di testo in JAVA
*/

import java.io.BufferedReader;    // libreria per leggere i file
import java.io.FileReader;    // libreria per leggere i file
import java.io.IOException;


public class read {

  public static void main(String[] args) throws IOException{
    
    FileReader file = new FileReader("test.txt");
    BufferedReader lettore = new BufferedReader(file);
    
    String linea = lettore.readLine();
    
    while(linea != null){
       System.out.println(linea);
       linea = lettore.readLine();
    
    }
    
    file.close(file);
    
  }
}

