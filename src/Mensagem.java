public class Mensagem {
    int id;
    long date;
    String texto;

    Mensagem (int id,String texto){
        this.id = id;
        date =System.currentTimeMillis();
        this.texto = texto;
    }
}