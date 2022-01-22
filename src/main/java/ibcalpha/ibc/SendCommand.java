package ibcalpha.ibc;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SendCommand {
    public static void main(String[] args) throws IOException {
        InetAddress host = InetAddress.getByName(args[0]);
        int port = Integer.getInteger(args[1], 7462);
        try (Socket socket = new Socket(host, port)) {
            try (OutputStream os = socket.getOutputStream()) {
                os.write((args[2] + "\nEXIT\n").getBytes(StandardCharsets.US_ASCII));
            }
        }
        System.out.println("ok");
    }
}
