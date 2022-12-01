import java.io.DataOutputStream;
import java.net.Socket;

public class cliente {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.0.114", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello world");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
