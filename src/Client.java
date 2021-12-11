import java.rmi.Naming;

public class Client {

      public static void main(String[] args) {
        try {
            MyInterface myService = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner scanner =new Scanner(System.in);
            String myString= scanner.nextLine();
            System.out.println("the reverse of that string : ");
            System.out.println(myService.Reverse(myString));
            System.out.println("the character that has the minimum ASCII value : ");
            System.out.println(myService.MinChar(myString));
            System.out.println("the result of CaseChanger :");
            System.out.println(myService.CaseChanger(myString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
