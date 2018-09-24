package sistemas.distribuidos.sistema.model;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
	public static void main (String [] args ) throws IOException { 
		int filesize=1022386; 
		int bytesRead; 
		int currentTot = 0; 
		Socket socket = new Socket("127.0.0.1",15123); 
		byte [] bytearray = new byte [filesize];
		InputStream inputStream = socket.getInputStream(); 
		FileOutputStream fileOutputStream = new FileOutputStream("copy.doc");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream); 
		bytesRead = inputStream.read(bytearray,0,bytearray.length); 
		currentTot = bytesRead;
		do { 
			bytesRead = inputStream.read(bytearray, currentTot, (bytearray.length-currentTot)); 
			if(bytesRead >= 0) currentTot += bytesRead; 
		} while(bytesRead > -1); 
		bufferedOutputStream.write(bytearray, 0 , currentTot); 
		bufferedOutputStream.flush();
		bufferedOutputStream.close(); 
		socket.close();
	} 
} 

