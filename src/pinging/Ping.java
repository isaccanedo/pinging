package pinging;

// Programa Java para executar ping em um endere�o IP
import java.io.*; 
import java.net.*; 

public class Ping {

	// Envia solicita��o de ping para um endere�o IP fornecido 
	  public static void sendPingRequest(String ipAddress) 
	              throws UnknownHostException, IOException 
	  { 
	    InetAddress geek = InetAddress.getByName(ipAddress); 
	    System.out.println("Enviando solicita��o de ping para " + ipAddress); 
	    if (geek.isReachable(5000)) 
	      System.out.println("O host est� acess�vel!"); 
	    else
	      System.out.println("N�o podemos alcan�ar o host!"); 
	  } 
	  
	  public static void main(String[] args) 
	          throws UnknownHostException, IOException 
	  { 
	    String ipAddress = "127.0.0.1"; 
	    sendPingRequest(ipAddress); 
	  
	    ipAddress = "133.192.31.42"; 
	    sendPingRequest(ipAddress); 
	  
	    ipAddress = "145.154.42.58"; 
	    sendPingRequest(ipAddress); 
	  } 
	} 
