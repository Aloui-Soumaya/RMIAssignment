import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    public String Reverse (String chaine) throws RemoteException;
    public String CaseChanger(String chaine) throws  RemoteException;
    public char MinChar(String chaine) throws  RemoteException;

}
