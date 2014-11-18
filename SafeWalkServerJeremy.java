import java.io.*;
import java.net.*;

public class SafeWalkServerJeremy implements Runnable {
    private  ServerSocket ss;
    

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

    public int getLocalPort() {
	return ss.getLocalPort();
    }

    public void run() {
	try {
	    while(true) {
		Socket s = ss.accept();
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
	    }
	}
    }

    

    public static void main(String[] args) {
	
	
    }
}
