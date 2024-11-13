public class Eleitor {
    int NumEleitor;
    String NomeEleitor;
    int NumSecao;
    
    Eleitor(){
        this(0," ",0);
    }
    
    Eleitor(int NEleitor, String NameEleitor, int NSecao){
        NumEleitor = NEleitor;
        NomeEleitor = NameEleitor;
        NumSecao = NSecao;        
    }
        
}
