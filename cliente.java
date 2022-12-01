
import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class cliente {

    public static void main(String[] args) throws IOException {
        String port, hostName;
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Ingresar numero de puerto");
        port = "6666";

        int portNumber = Integer.parseInt(port);
        // System.out.println("Ingresar nombre del host");
        hostName = "192.168.0.114";
        try (
                Socket echoSocket = new Socket(hostName, portNumber);
                PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));) {
            String userInput;
            System.out.println("Cliente Iniciado");
            System.out.println("Enter Exist to Stop");

            long TiempoCero;
            long Tiempo_Servidor;
            long TiempoUno;
            long Tiempo_final;

            out.println(TiempoCero = System.currentTimeMillis());
            Tiempo_Servidor = Long.parseLong(in.readLine());

            TiempoUno = System.currentTimeMillis();
            Tiempo_final = (Tiempo_Servidor + (TiempoUno - TiempoCero) / 2);
            DateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS");

            System.out.println(" Tiempo del Cliente:  " + formatter.format(new Date(TiempoUno)));
            System.out.println(" Tiempo del Servidor:  " + formatter.format(new Date(Tiempo_Servidor)));
            System.out
                    .println(" Tiempo del Cliente despues del reinicio:  " + formatter.format(new Date(Tiempo_final)));
            out.println("Salida");

        } catch (Exception ex) {
            System.out.println("Tiempo Agoyador :c ");
        }

    }
}
