package sistemas.distribuidos.sistema.model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerPeer {

	public static void main (String [] args ) throws IOException {
		ServerSocket serverSocket = new ServerSocket(15123);
		Socket socket = serverSocket.accept(); 
		File transferFile = new File ("Document.doc"); 
		byte [] bytearray = new byte [(int)transferFile.length()]; 
		FileInputStream fileInputStream = new FileInputStream(transferFile);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); 
		bufferedInputStream.read(bytearray,0,bytearray.length);
		java.io.OutputStream outputStream = socket.getOutputStream(); 
		outputStream.write(bytearray,0,bytearray.length);
		outputStream.flush(); 
		socket.close(); 
	} 
}

