/**
 *
 * @author Gustavo
 * Clube Cultural
 * Aplicação para controle de empréstimo de HQs
 * Início: 01/10/2024
 */
import javax.swing.JOptionPane;
public class ClubeCulturalMain {
    
    public static void main(String[] args) {
        //int HQ[] = new int[5];
        CCMeth C = new CCMeth();
        String emprestimo[] = new String[4];
        int opc = 0;
        while (opc != 9) {            
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Novo Empréstimo  \n2 - Cadastrar HQs \n3 - Cadastro de Amiguinhos \n4 - Amiguinhos  \n9 - Fim"));
            switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Novo Empréstimo");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Nova HQ");
                    //HQ = FCadastroHQ(HQ);
                    break;
                case 3:
                    //JOptionPane.showMessageDialog(null, "Novo Cadastro");
                    emprestimo = C.FCadastro(emprestimo);
                    break;
                case 4:
                    //JOptionPane.showMessageDialog(null, "Amiguinhos");
                    C.FShowCadastro(emprestimo);
                    break;                    
                case 9:
                    JOptionPane.showMessageDialog(null,"Encerrar Programa");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");  
            }
        }
    }    
}
