public class Utils {
    static int getSize(String nome){
        int size=0;
        //Calcular tamanho de uma string.
        size += nome.getBytes().length;
        return size;
    }
    static int getSize(int number){
        return 4;//bytes
        //return 32;//bits
    }
    static int getSize(long number){
        return 8;//bytes
        //return 64;//bits
    }
}
