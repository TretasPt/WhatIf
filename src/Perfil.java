public class Perfil {
    Pagina[] Paginas;
    String[] nomes;

    Perfil(String nome, int id, String texto){
        nomes = new String[1];
        nomes[0] = nome;
        Paginas = new Pagina[1];
        Paginas[0] = new Pagina();
        Paginas[0].addMessage(id, texto);
    }
    Perfil(String nome){
        nomes = new String[1];
        nomes[0] = nome;
        Paginas = new Pagina[1];
    }
}