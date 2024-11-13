import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 * Início: 13/11/2024
 * Sistema de Eleição
 * Feito com base nas instruções do professor Ricardo Satoshi
 * 
 */
public class Principal_Eleicao {
    public static void main(String[] args) throws IOException{
        Eleitor[] elect = new Eleitor[10];
        Eleicao_Methods meth = new Eleicao_Methods();
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("*** MENU PRINCIPAL ***"
                    + "\n1 - Cadastrar Eleitor \n2 - Cadastrar Votação 1 e 2 \n3 - Agrupa Apuração"
                    + "\n4 - Menu Estatística \n9 - FInalizar"));
            switch(opc){
                case 1: 
                    elect = meth.CadastroEleitor(elect);
                    break;
            }
        }
    }
}
