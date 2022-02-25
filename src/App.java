import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
// import java.nio.file.Path;
// import java.nio.file.Paths;
import java.util.Scanner;  

public class App {
    private static int maxId = 0;
    private static Perfil[] perfies;
    private static boolean keepGoing = true;
    // private static Path path;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        // path = Paths.get("ROOT");
        print(ANSI_BLUE + "Type 'help' for a list of commands." + ANSI_RESET);
        Scanner input = new Scanner(System.in);
        while(keepGoing){
            // operation();
            String command = input.nextLine().toString();
            command(command);
        }
        input.close();
    }

    public static void command(String command){
        String[] arguments = command.split(" ");
        switch (arguments[0].toLowerCase()){
            case "help":
                print(ANSI_BLUE + "help\nquit\nprint\nlock\nnewprofile\nclear" + ANSI_RESET);
                break;
            case "quit":
                keepGoing=false;
                break;
            case "print":
                String toPrint =arguments[1];
                
                for (int i = 2; i!= arguments.length;i++){
                    toPrint += " " + arguments[i];
                }
                // System.out.println(ANSI_BLUE + toPrint + ANSI_RESET);
                print(ANSI_BLUE + toPrint + ANSI_RESET);

                break;
            case "lock":
                lock();
                break;
            case "newprofile":
                if (arguments.length==1)
                    print(ANSI_BLUE + "Sintaxe:\n \"newprofile <profilename>\"\n <pofilename> - Uma palavra ou frase. (String). " + ANSI_RESET);
                else{
                    String nome = "";
                    for (int i = 1; i != arguments.length; i++){
                        nome += arguments[i];
                    }
                    newProfile(nome);
                    }
                break;
            case "listprofiles":
                listProfiles();
                break;
            case "clear":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
            case "sum":
                    System.out.println(sum(arguments));
                    break;
            case "getsize":
                    getSize();
                    break;
            default:
                print(ANSI_BLUE + "Command not recognized. Type 'help' for available commands." + ANSI_RESET);
        }
    }

    public static void print(String texto){
        PrintStream ps = null;

        try {
            ps = new PrintStream(System.out, true, "iso-8859-1");
            } catch (UnsupportedEncodingException error) {
            System.err.println(error);
            System.exit(0);
            }
            ps.println(texto);

    }

    public static void lock(){
        getSize();
    }

    public static int getSize(){
        int size = 0;
        if (perfies!=null){
            for (int i = 0; i != perfies.length; i++){
                size += perfies[i].getSize();
            }
            print(ANSI_BLUE + "Este commando ainda não está concluido. Aqui tens o tamanho dos conteudos existentes:" + String.valueOf(size) + "Bytes." + ANSI_RESET);
        }else{
            print(ANSI_BLUE + "Não existem perfies." + ANSI_RESET);
        }
        return size;
    }

    public static void listProfiles(){
        if (Utils.isNull(perfies)){
            print(ANSI_BLUE + "Não exstem perfies." + ANSI_RESET);
        }else{
            String lsPerfies = "Id:" + perfies[0].getId() + "       " + perfies[0].getName();
            if (perfies.length!=1){
                for (int i = 1; i!= perfies.length; i++){
                    lsPerfies += "\nId:" + perfies[i].getId() + "       " + perfies[i].getName();
                }
            }
            print(ANSI_BLUE + lsPerfies + ANSI_RESET);
        }
    }

    public static void newProfile(String nome){
        maxId++;
        if (Utils.isFull(perfies)){
            if (Utils.isNull(perfies)){
                perfies= new Perfil[1];
            }else{
             
                Perfil[] tempPerfies = new Perfil[(int)Math.round(perfies.length +perfies.length*0.5)];
                for (int i = 0; i!= perfies.length;i++){
                    tempPerfies[i] = perfies[i];
                }
                perfies = tempPerfies;   
            }
            // newProfile(nome);
        }
        perfies[Utils.firstFree(perfies)]= new Perfil(nome, maxId);
    }
    
    public static int sum(String[] arguments){
        int sum =0;
        for (int i = 1; i!=arguments.length; i++){
            try{
                sum += Integer.valueOf(arguments[i]);
            } catch(NumberFormatException inv){
                System.out.println("Invalid number in: " + arguments[i]);
            }
        }
            return sum;
    }

}