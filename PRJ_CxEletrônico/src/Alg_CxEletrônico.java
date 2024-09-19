/**
 *
 * @author Gustavo
 * Alg_CxEletrônico
 * 18/09/2024
 * 
 * 
 */
import javax.swing.JOptionPane;
public class Alg_CxEletrônico {
    public static void main(String[] args) {
        //Menu Principal
        int opt, q;
        int M[][] = new int[8][8];
        q = 0;
        do{
            opt = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal: Escolha uma Opção(1 - Carregar Notas; 2 - Retirar Notas; 3 - Estatísticas; 9 - Sair)"));
            switch (opt) {
                case 1: if(q != 0){
                    JOptionPane.showMessageDialog(null,"Caixa já carregado");
                } else{
                    M = CarregaM(M);
                    q = q + 1;
                }
                    break;
                case 2: 
                default:
                    throw new AssertionError();
            }
        }while(opt != 9);
    }
    
    
    static int[][] CarregaM(int Mat[][]){
        int x, y;
        for(x = 0; x < 3; x++){
            for(y = 0; y < 6; y++){
                Mat[x][y] = 100;
            }
        }
        return Mat;
    }
}
