/**
 *
 * @author Gustavo
 * LT02_HomoVet05
 * 18/09/2024
 * 5.	Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
        10
        ∑ (A[1] – A[21–1])
        i = 1

 * 
 */
import javax.swing.JOptionPane;
public class LT02_HomoVet05 {
    public static void main(String[] args) {
        int STot, S, i;
        int A[] = new int[20];
        STot = 0;
        
        for(i = 1; i <= 10; i++){
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        }
        for(i = 1; i <= 5; i++){
            S = A[i] + A[11-i];
            STot = STot + S;
        }
        JOptionPane.showMessageDialog(null, "A somatória é "+STot);
    }
}
