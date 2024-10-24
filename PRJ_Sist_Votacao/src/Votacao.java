class Votacao {
    int NumeroSecao;
    int NumeroCandidato;
    
    Votacao(){
        this(0,0);
    }
    
    Votacao (int SectionNum, int CandNum){
        NumeroSecao = SectionNum;
        NumeroCandidato = CandNum;
    }
}
