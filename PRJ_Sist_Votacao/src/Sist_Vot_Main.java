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
        Votacao[] vot = new Votacao[200];
        Votacao2024 vot24 = new Votacao2024();
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("*** SISTEMA DE VOTAÇÃO ***"
                    + "\n1 - Carregar Seção/Número Eleitor \n2 - Classificar por Seção "
                    + "\n3 - Gravar Registros \n4 - Mostrar Indicadores \n9 - Finalizar"));
            switch(opc){
                case 1: 
                    vot = vot24.CadastroVotacao(vot);
                    break;
                case 2: 
                    vot = vot24.ClassificaVot(vot);
                    break;
                case 3:
                    vot = vot24.GravaVot(vot);
                    break;
                case 4:
                    int opc2 = 0;
                        
                    while(opc2 != 9){
                        opc2 = Integer.parseInt(JOptionPane.showInputDialog("*** MOSTRAR INDICADORES ***"
                            + "\n1 - Eleitores por Seção \n2 - Seção com Maior e Menor Número de Eleitores "
                            + "\n3 - Quantidade de votos por candidato \n4 - 10 primeiros colocados "
                                + "\n9 - Finalizar"));
                        switch(opc2){
                            case 1:
                                vot24.PEleitoresSecao(vot);
                                break;
                            case 2:
                                vot24.PMaiorMenorNumero(vot);
                                break;
                        }
                    }
                    break;
                    
            }   
            
        }
    }
 
}
