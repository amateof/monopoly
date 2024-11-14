import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedInputStream;
public class Flujo {
    public static void main(String[] args) throws IOException {
    final PipedOutputStream salida = new PipedOutputStream();
    final PipedInputStream entrada = new PipedInputStream(salida);



    Thread hilo1 = new Thread(new Runnable() {
        public void run() {
            try {
                salida.write("Hola, mundo".getBytes());
                salida.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    });

    Thread hilo2 = new Thread(new Runnable() {
        public void run() {
            try {
                int unByte = entrada.read();

                while (unByte != -1) {
                    System.out.print((char) unByte);
                    unByte = entrada.read();
                }
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    });

    hilo1.start();
    hilo2.start();
}}








    
    



   