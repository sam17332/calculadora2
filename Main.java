/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Calculadora main = new Calculadora();
        File opera = new File(System.getProperty("user.dir")+"\\"+"datos.txt");
        FileReader leer = new FileReader(opera);
        BufferedReader buff = new BufferedReader(leer);
        
        String linea;
        while((linea = buff.readLine()) != null){
          System.out.println(linea);
          System.out.println("Respuesta: " + main.calcular(linea) + "\n");
        }

        
        
        
    }
    
}
