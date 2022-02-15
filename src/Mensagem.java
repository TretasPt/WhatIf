public class Mensagem {
    int id;
    long date;
    String texto;

    Mensagem (int id,String texto){
        this.id = id;
        date =System.currentTimeMillis();
        this.texto = texto;
    }

    int getSize(){
        int size = 0;
        size += Utils.getSize(id);
        size += Utils.getSize(date);
        size += Utils.getSize(texto);
        return size;
    }
}