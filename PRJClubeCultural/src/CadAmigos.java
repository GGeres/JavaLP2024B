/**
 *
 * @author Gustavo
 */
class CadAmigos {
    String FriendName;
    String FriendMom;
    String PhoneNumber;
    String EscolaPredio;
    
    CadAmigos(){
        this(" "," "," "," "); //Preparação de registro lógico. Sem isso não é possível iniciar.
    }
    
    CadAmigos(String PFName, String PFMom, String PPNumber, String PEPredio){
        PFName = FriendName;
        PFMom = FriendMom;
        PPNumber = PhoneNumber;
        PEPredio = EscolaPredio;
    }        
}
