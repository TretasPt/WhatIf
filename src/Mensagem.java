public class Mensagem {
    private int id;
    private long date;
    private String texto;

    Mensagem (int id,String texto){
        this.id = id;
        this.texto = texto;
        date =System.currentTimeMillis();
    }

    int getSize(){
        int size = 0;
        size += Utils.getSize(id);
        size += Utils.getSize(date);
        size += Utils.getSize(texto);
        return size;
    }
    int getId(){
        return id;
    }
    long getDate(){
        return date;
    }
}