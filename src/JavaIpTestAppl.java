import java.net.*;

public class JavaIpTestAppl {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress [] adresses = InetAddress.getAllByName("google.com");
		int i = 1;
		for(InetAddress adress : adresses){
			System.out.println(i++ + " " + adress.getHostName() + " " + adress.getHostAddress());
		}
	}
}
