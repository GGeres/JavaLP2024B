import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 * Classe Main: Sistema de Votação (Estatistica)
 * 23/10/2024
 * 
 * 
 */
public class Sist_Vot_Main {
    public static void main(String[] args) throws IOException{
        Votacao[] vot = new Votacao[5];
        Votacao2024 vot24 = new Votacao2024();
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("*** SISTEMA DE VOTAÇÃO ***\n1 - Carregar Seção/Número Eleitor \n2 - Classificar por Seção "
                    + "\n3 - Gravar Registros \n4 - Mostrar Indicadores \n9 - Finalizar"));
            switch(opc){
                case 1: 
                    vot = vot24.CadastroVotacao(vot);
                    break;
            }
        }
    }
 
}
