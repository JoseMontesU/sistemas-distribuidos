import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * servidor
 */
public class servidor {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            System.out.println("Client Says = " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}