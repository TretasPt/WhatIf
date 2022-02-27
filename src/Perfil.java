public class Perfil {
    private Pagina[] Paginas;
    private String[] nomes;
    private int id;

    // Perfil(String nome, int id, String texto){
    //     nomes = new String[1];
    //     nomes[0] = nome;
    //     Paginas = new Pagina[1];
    //     Paginas[0] = new Pagina();
    //     Paginas[0].addMessage(id, texto);
    // }
    Perfil(String nome, int id){
        this.id= id;
        nomes = new String[1];
        nomes[0] = nome;
        // Paginas = new Pagina[1];
    }

    int getSize(){
        int size =0;
        if (Paginas!=null){
            for (int i=0; i!=Paginas.length;i++){
                size += Paginas[i].getSize();
            }
        }
        for (int i = 0; i!= nomes.length;i++){
            size += Utils.getSize(nomes[i]);
        }
        size += Utils.getSize(id);
        return size;
    }
    String[] getAliases(){
        return nomes;
    }
    int getNOfPages(){
        return Paginas.length;
    }
    int getNOfMessages(){
        int Messages=0;
        for (Pagina i : Paginas){
            Messages+=i.getNOfMessages();
        }
        return Messages;
    }
    int getId(){
        return id;
    }
    String getName(){
        return nomes[0];
    }

    void addAlias(String nome){
        String[] tempNomes =new String[nomes.length+1];
        for (int i=0;i!=nomes.length;i++){
            tempNomes[i]=nomes[i];
        }
        tempNomes[nomes.length]= nome;
        nomes=tempNomes;
    }

    String[][][][] tree(){
        String[][][][] treeData = new String[3][][][];
        String[][][] paginas; 
        String[][][] names = new String[1][1][nomes.length];
        String[][][] ids;

        if (Paginas == null){
            String empty = "Empty.";
            paginas = new String[1][1][1];
            ids = new String[1][1][1];
            paginas[0][0][0]=empty;
            ids[0][0][0]=empty;
        }else{
            paginas = new String[Paginas.length][][];
            ids = new String[1][1][Paginas.length];
            for (int i = 0; i!= Paginas.length;i++){
                paginas[i] = Paginas[i].tree();
                ids[0][0][i] = String.valueOf(Paginas[i].getId());
            }
        }
            for (int i = 0; i!= nomes.length; i++){
                names[0][0][i] = nomes[i];
            }
        
        treeData[0] = paginas;
        treeData[1] = names;
        treeData[2] = ids;
        return treeData;
    }
}