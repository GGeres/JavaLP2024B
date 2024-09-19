/**
 *
 * @author Gustavo
 * LT02_HomoVet06
 * 18/09/2024
 * 6.	Criar e coletar em um vetor [20] com números aleatórios. 
 *      Classificar este vetor em ordem crescente e mostre os dados.
 * 
 * 
 */
import javax.swing.JOptionPane;
public class LT02_HomoVet06 {
    public static void main(String[] args) {
        int i, j, aux;
        int V[] = new int[20];
        
        for(i = 0; i < 5; i++){
            V[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        }
        for(i = 0; i < 4; i++){
            for(j = (i+1); j < 5; j++){
                if(V[i] > V[j]){
                    aux = V[i];
                    V[i] = V[j];
                    V[j] = aux;
                }
            }
        }
        for(i = 0; i < 5; i++){
            System.out.println(V[i]);
        }
    }
}
