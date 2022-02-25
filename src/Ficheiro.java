import java.nio.file.Path;
// import java.nio.file.Paths;
import java.io.File;

public class Ficheiro {
    String nome;
    Path path;
    int id;

    Ficheiro(String nome, Path path){
        nome = this.nome;
        path=this.path;
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
}
