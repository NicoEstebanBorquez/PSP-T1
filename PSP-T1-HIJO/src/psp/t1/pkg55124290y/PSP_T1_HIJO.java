package psp.t1.pkg55124290y;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PSP_T1_HIJO {

    public static void main(String[] args) throws IOException {

        //Número que recibe desde el proceso padre (del 1 al 10)
        BufferedReader recibidoDesdePadre = new BufferedReader(new InputStreamReader(System.in));
        int numero = Integer.parseInt(recibidoDesdePadre.readLine());

        String tablaMultiplicar = "";

        //El bucle recibe cada numero del 1 al 10 y realiza el calculo de la tabla
        for (int i = 0; i <= 10; i++) {
            tablaMultiplicar += numero + "x" + i + "=" + numero * i + " | ";
        }
        
        //Con esta sentencia devolvemos al padre un string con una tabla de multiplicar
        System.out.println(tablaMultiplicar);
        
    }
}
