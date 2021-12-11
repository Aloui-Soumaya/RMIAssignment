import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
    public String Reverse (String chaine){
        String res="";
        for(int i=0;i<chaine.length();i++)
            res=chaine.charAt(i)+res;
        return res;
    }
    public char MinChar(String chaine){
        char min=chaine.charAt(0);
        for(int i=1;i<chaine.length();i++)
            if (chaine.charAt(i)<min)
                min=chaine.charAt(i);
        return min;
    }
    public String CaseChanger(String chaine){
        String res="";
        for(int i=0;i<chaine.length();i++){
            if(Character.isLowerCase(chaine.charAt(i)))
                res=res+Character.toUpperCase(chaine.charAt(i));
            else if (Character.isUpperCase(chaine.charAt(i)))
                res=res+Character.toLowerCase(chaine.charAt(i));
        }
        return res;
    }
}
