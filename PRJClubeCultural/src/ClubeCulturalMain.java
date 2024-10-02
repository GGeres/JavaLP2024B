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
        int opc = 0;
        while (opc != 9) {            
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Novo Empréstimo  \n2 - Cadastrar HQs \n3 - Cadastro de Amiguinhos  \n9 - Fim"));
            switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Novo Empréstimo");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Nova HQ");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Novo Cadastro");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");  
            }
        }
    }
}
