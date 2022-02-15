import java.util.Scanner;    

public class App {
    private static int maxId;
    private static Perfil[] perfies;

    public static void main(String[] args) {
        operation();

    }

    public static void lock(){
        int size = 0;
        for (int i = 0; i != perfies.length; i++){
            size += perfies[i].getSize();
        }
    }

    public static void operation(){
        Scanner input = new Scanner(System.in);
        System.out.print("O que queres fazer?" + "\n" + "Escrever(W)|Ver(R)|Sair(Q): ");
        char operation = input.next().charAt(0);
        // input.close();
        if (operation=='Q')
            quit();
        else if (operation=='R')
            read();
            // Perfil perfil = new Perfil(nome, id, texto);
            // System.out.print("O teu texto é: " +perfil.Paginas[0].Mensagens[0].texto);
            // System.out.println();

            // printArr(perfil.getAliases());
            // perfil.addAlias("NotJoão.");
            // printArr(perfil.getAliases());
        else if (operation=='W')
            write();
            // System.out.println("Cria o primeiro perfil.");
            // System.out.print("Introduz o nome do perfil: ");
            // input.nextLine();
            // // Scanner scNome = new Scanner(System.in);
            // // input.useDelimiter("");
            // String nome = input.nextLine();
            // System.out.print("Introduz o id da mensagem(TEMP): ");
            // int id = input.nextInt();
            // System.out.print("Introduz o texto da mensagem: ");
            // input.useDelimiter("__END__");
            // input.nextLine();
            // String texto = input.next();
            // input.close();
        else
            operation();
        input.close();
    }
    
    public static void read(){
        System.out.println("Read mode.");
    }
    public static void write(){
        System.out.println("Write mode.");
    }
    public static void quit(){
        System.out.println("Quit mode.");
    }
    static void printArr(String[] stringArr){
        for (String i : stringArr)
            System.out.print('"' + i + '"');
    }
}