import java.io.*;
import java.net.*;

public class SafeWalkServerJeremy {
    int port;

    public SafeWalkServerJeremy(int port) throws IOException {
	ServerSocket ss = new ServerSocket(port);
	System.out.println("Socket is bound to port: " + port);
	ss.setReuseAddress(true);
    }

    public SafeWalkServerJeremy() throws IOException {
	ServerSocket ss = new ServerSocket(0);
	System.out.println("Socket is bound to port: " + ss.getLocalPort());
	ss.setReuseAddress(true);
    }

    public void run() {
	while(true) {
	    Socket s = accept();
	    
	}

    

    public static void main(String[] args) {
	
	
    }
}
