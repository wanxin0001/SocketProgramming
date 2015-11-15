// SimpleClient.java: A simple client program
import java.net.*;
import java.io.*;

public class SimpleClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 1254);
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		String request = "I am client";
		dataOutputStream.writeUTF(request);

		String response = new String(dataInputStream.readUTF());
		System.out.println(response);

		dataInputStream.close();
		socket.close();
	}
}