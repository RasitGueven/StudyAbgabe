/**
 * @author Overberg Jonathan 5579562
 */
package pp2017.team10.server.comm;

import java.util.LinkedList;
import java.util.Queue;
import pp2017.team10.server.*;
import pp2017.team10.shared.*;
public class Server_Main  {
		static Queue<Messages> schlange=new LinkedList<Messages> ();
		
		
		/**
		 * Main methode die einen Server mit port 1500 oeffnet
		 */
		 public static void main(String[] args) {
	    	int portNumber = 1500;
	  
	    	ServerComm server = new ServerComm(portNumber);
	    	
	    	server.start();
	    	
	   }
	}