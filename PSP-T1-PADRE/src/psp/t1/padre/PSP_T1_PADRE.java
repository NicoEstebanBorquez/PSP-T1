package psp.t1.padre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PSP_T1_PADRE {

    public static void main(String[] args) {

        try {
            Process hijo = null;
            PrintStream enviadoAlHijo = null;
            BufferedReader recibidoDesdeHijo = null;

            for (int i = 1; i <= 10; i++) {
                hijo = new ProcessBuilder("java", "-jar", "PSP-T1-HIJO.jar").start();
                enviadoAlHijo = new PrintStream(hijo.getOutputStream());
                recibidoDesdeHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));

                enviadoAlHijo.println(i);
                enviadoAlHijo.flush();
                System.out.println("Tabla del " + i + ": " + recibidoDesdeHijo.readLine());
            }

            System.out.println("******************************************\n"
                    + "* PSP - Tarea Individual 1           *\n"
                    + "******************************************\n"
                    + "* Nicolás Esteban Bórquez            *\n"
                    + "******************************************\n"
                    + "* 55124290Y                          *");

        } catch (IOException ex) {
            Logger.getLogger(PSP_T1_PADRE.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
