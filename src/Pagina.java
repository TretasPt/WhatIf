public class Pagina {
    Mensagem[] Mensagens;
    Ficheiro[] Fixeiros;

    Pagina(){}

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
        for (int i = 0; i != Mensagens.length; i++){
            size += Mensagens[i].getSize();
        }
        for (int i = 0; i != Fixeiros.length; i++){
            size += Fixeiros[i].getSize();
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
}
