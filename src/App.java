import java.util.Scanner;

public class App {

    // public static void main(String[] args) {

    //     Scanner input = new Scanner(System.in);
    //     input.useDelimiter("__END__");
    //     System.out.print("Enter your name: ");
    //     String name = input.next();
    //     System.out.println(name);
    //     input.close();
    //   }

    public static void main(String[] args) {
        System.out.print("O que queres fazer?(Escrever(W)|Ver e Editar(E)): ");
        Scanner input = new Scanner(System.in);
        char operation = input.next().charAt(0);
        // input.close();
        System.out.println(operation);

        System.out.println("Cria o primeiro perfil.");
        System.out.print("Introduz o nome do perfil: ");
        input.nextLine();
        // Scanner scNome = new Scanner(System.in);
        // input.useDelimiter("");
        String nome = input.nextLine();
        System.out.print("Introduz o id da mensagem(TEMP): ");
        int id = input.nextInt();
        System.out.print("Introduz o texto da mensagem: ");
        input.useDelimiter("__END__");
        input.nextLine();
        String texto = input.next();
        input.close();
        Perfil perfil = new Perfil(nome, id, texto);
        System.out.print("O teu texto é: " +perfil.Paginas[0].Mensagens[0].texto);
    }
}