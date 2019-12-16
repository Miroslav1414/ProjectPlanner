package projecrplanerserver;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;



public class ProjectPlanerServer {
    public static final int TCP_PORT = 9999;
    public static final String URL = "jdbc:mysql://localhost:3306/projectplaner?useUnicode=true&characterEncoding=utf-8";
    public static final String username = "student";
    public static final String password = "student";
    
    public static HashMap<String, PrintWriter> users = new HashMap<>();

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(TCP_PORT);
            System.out.println("Server running...");
            while (true) {
                Socket sock = ss.accept();
                System.out.println("Client accepted: ");
                
                ServerThread st = new ServerThread(sock);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
