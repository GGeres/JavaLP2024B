public class Votacao {
    int Section;
    int CodCandidato;
    int NEleitor;
    
    Votacao(){
        this(0,0,0);
    }
    
    Votacao(int Secao, int CCand, int Eleitor){
        Section = Secao;
        CodCandidato = CCand;
        NEleitor = Eleitor;
    }
    
}
