public class Pagina {
    Mensagem[] Mensagens;

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
}
