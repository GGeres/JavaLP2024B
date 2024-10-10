/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class CCMeth {
    public String[] FCadastro(String Friend[]){
    CadAmigos[] cAmigos = new CadAmigos[3];
        int i;
        
        for(i = 0; i < 1; i++){
            cAmigos[i] = new CadAmigos();
        }
        
        for(i = 0; i < 1; i++){
            cAmigos[i].FriendName = JOptionPane.showInputDialog("Qual o nome do Amiguinho?");
            cAmigos[i].FriendMom = JOptionPane.showInputDialog("Qual o nome da mãe do amiguinho?");
            cAmigos[i].PhoneNumber = JOptionPane.showInputDialog("Digite o telefone de contato");
            cAmigos[i].EscolaPredio = JOptionPane.showInputDialog("Ele é da Escola ou do Prédio?");
        }
        return Friend;
    }
}
