package projectplanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ProjectPlanner {
    static int PORT = 9999;
    static InetAddress adresa;
    static Socket sock;
    static BufferedReader in;
    static PrintWriter out;
    static String poruka;
    static String odgovor;
    static Login login;
    
    public ProjectPlanner() {
        try {
            adresa = InetAddress.getByName("127.0.0.1");
            sock = new Socket(adresa, PORT);
            in = new BufferedReader(
                new InputStreamReader(sock.getInputStream()));
            out = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(
                        sock.getOutputStream())), true);
            poruka = "";
            odgovor = "";
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
        }                
    }
    
    static void kraj() {
        try {
            out.println("KRAJ");
            in.close();
            out.close();
            sock.close();            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            
        }        
    }
    
    static String ispitajDaLiImaApostrof(String s) {
        String noviString = s;
        if(s.contains("'")) {
            noviString = s.replaceAll("\'", "''");
        }
        if(s.contains("#")) {
            noviString = s.replaceAll("#", " ");
        }
        return noviString;
    }
    
    static boolean ispitajDuzinu(String s, int i) {
        if(s.length()<i && s.length()>0)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        ProjectPlanner planer = new ProjectPlanner();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login = new Login(new javax.swing.JFrame(), true);
                login.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        kraj();
                        System.exit(0);
                    }
                });
                login.setVisible(true);
            }
        });
    }
    
}
