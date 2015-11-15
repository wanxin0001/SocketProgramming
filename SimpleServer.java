// SimpleServer.java: A simple server program
import java.net.*;
import java.io.*;

public class SimpleServer {
	public static void main (String[] args) throws IOException {
		int PORT = 1254;
		ServerSocket serverSocket = new ServerSocket(PORT);
		while (true) {
			Socket socket = serverSocket.accept();

			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream dataInputSream = new DataInputStream(socket.getInputStream());
			String request = dataInputSream.readUTF();
			System.out.println(request);

			dataOutputStream.writeUTF("Hi, I am server.");

			dataInputSream.close();
			dataOutputStream.close();
			socket.close();
		}
	}
}