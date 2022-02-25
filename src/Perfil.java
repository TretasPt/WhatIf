public class Perfil {
    Pagina[] Paginas;
    String[] nomes;
    int id;

    Perfil(String nome, int id, String texto){
        nomes = new String[1];
        nomes[0] = nome;
        Paginas = new Pagina[1];
        Paginas[0] = new Pagina();
        Paginas[0].addMessage(id, texto);
    }
    Perfil(String nome, int id){
        this.id= id;
        nomes = new String[1];
        nomes[0] = nome;
        // Paginas = new Pagina[1];
    }

    int getSize(){
        int size =0;
        if (Paginas!=null){
            for (int i=0; i!=Paginas.length;i++){
                size += Paginas[i].getSize();
            }
        }
        for (int i = 0; i!= nomes.length;i++){
            size += Utils.getSize(nomes[i]);
        }
        size += Utils.getSize(id);
        return size;
    }

    String[] getAliases(){
        return nomes;
    }
    int getNOfPages(){
        return Paginas.length;
    }
    int getNOfMessages(){
        int Messages=0;
        for (Pagina i : Paginas){
            Messages+=i.getNOfMessages();
        }
        return Messages;
    }

    int getId(){
        return id;
    }
    String getName(){
        return nomes[0];
    }

    void addAlias(String nome){
        String[] tempNomes =new String[nomes.length+1];
        for (int i=0;i!=nomes.length;i++){
            tempNomes[i]=nomes[i];
        }
        tempNomes[nomes.length]= nome;
        nomes=tempNomes;
    }
}