import java.nio.file.Path;
// import java.nio.file.Paths;
import java.io.File;

public class Ficheiro {
    private String nome;
    private Path path;
    private int id;

    Ficheiro(int id, String nome, Path path){
        this.id = id;
        this.nome = nome;
        this.path = path;
    }

    int getSize(){
        int size = 0;
        size += Utils.getSize(id);
        size += Utils.getSize(nome);
        size += Utils.getSize(path.toString());
        File ficheiro = path.toFile();
        size += ficheiro.getTotalSpace();
        return size;
    }
    int getId(){
        return id;
    }
    String getNome(){
        return nome;
    }
}
