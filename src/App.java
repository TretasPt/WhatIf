import java.util.Scanner;    

public class App {
    private static int maxId;
    private static Perfil[] perfies;
    private static boolean keepGoing = true;

    public static void main(String[] args) {
        System.out.println("Type 'help' for a list of commands.");
        Scanner input = new Scanner(System.in);
        while(keepGoing){
            // operation();
            String command = input.nextLine().toString().toLowerCase();
            command(command);
        }
        input.close();
    }

    public static void lock(){
        int size = 0;
        for (int i = 0; i != perfies.length; i++){
            size += perfies[i].getSize();
        }
    }

    public static void command(String command){
        
        // if (input.hasNext()){
            
        // String command = input.next().toString().toLowerCase();
        switch (command){
            case "help":
                System.out.println("help quit");
                break;
            case "quit":
                keepGoing=false;
                break;
            default:
                System.out.println("Command not recognized. Type 'help' for available commands.");
                // input.next();
        }
        // }
    }

}