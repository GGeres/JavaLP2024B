/**
 *
 * @author Gustavo
 * LT02_HomoVet02
 * 18/09/2024
 * 2.	Criar e coletar um vetor [100] inteiro e exibir:
    a.	O maior e o menor valor;
    b.	A média dos valores.
 * 
 */
import javax.swing.JOptionPane;
public class LT02_HomoVet02 {
    public static void main(String[] args) {
        int S, L, B, i;
        double M;
        int Vet[] = new int[50];
        
        S = 0;
        L = 1000000;
        B = 0;
        for(i = 0; i < 8; i++){
            Vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if(Vet[i] > B){
                B = Vet[i];
            }
            if(Vet[i] < L){
                L = Vet[i];
            }
            S = S + Vet[i];
        }
        M = S / (i - 1);
        JOptionPane.showMessageDialog(null, "O maior valor é "+B);
        JOptionPane.showMessageDialog(null, "O menor valor é "+L);
        JOptionPane.showMessageDialog(null, "A média dos valores é "+M);
    }
}
