public class Pagina {
    private Mensagem[] Mensagens;
    private Ficheiro[] Ficheiros;
    private int id;

    Pagina(int id){
        this.id =id;
    }

    void addMessage (int id, String texto){
        Mensagem[] tempMensagens;
        if (Mensagens==null) {
            tempMensagens = new Mensagem[1];
        }else{
            tempMensagens = new Mensagem[Mensagens.length+1];
        }

        for (int i =0;i!=tempMensagens.length-1;i++){
            tempMensagens[i] = Mensagens[i];
        }
        tempMensagens[tempMensagens.length-1]= new Mensagem(id, texto);
        Mensagens = tempMensagens;
    }

    int getSize(){
        int size = 0;
        if (Mensagens!=null){
            for (int i = 0; i != Mensagens.length; i++){
                size += Mensagens[i].getSize();
            }
        }
        if (Ficheiros!=null){
            for (int i = 0; i != Ficheiros.length; i++){
                size += Ficheiros[i].getSize();
            }
        size += Utils.getSize(id);
        }
        return size;
    }
    int getNOfMessages(){
        if (Mensagens==null) {
            return 0;
        }else{
            return Mensagens.length;
        }
    }
    int getId(){
        return id;
    }
    void tree(){
        if (Mensagens != null){
            for (int i = 0; i!= Mensagens.length; i++){
                App.print(String.format("       " , Mensagens[i].getId() , Mensagens[i].getDate()));
            }
        }
        if (Ficheiros != null){
            for (int i = 0; i!= Ficheiros.length; i++){
                App.print(String.format("       " , Ficheiros[i].getId() , Ficheiros[i].getNome()));
            }
        }
    }
}
