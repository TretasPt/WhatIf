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

    static boolean isNull(Perfil[] perfies){
        return (perfies==null);
    }
    static boolean isFull(Perfil[] perfies){
        if (isNull(perfies))
            return true;
        return perfies[perfies.length-1]!=null;
    }
    static int firstFree(Perfil[] perfies){
        for (int i = 0; i!= perfies.length; i++){
            if (perfies[i]==null)
                return i;
        }
        throw new IllegalStateException("Tentou encontrar a primeira vaga num vetor completo.");
    }
}
