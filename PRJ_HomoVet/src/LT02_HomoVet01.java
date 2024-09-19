/**
 *
 * @author Gustavo
 * LT02_HomoVet01
 * 18/09/2024
 * 1.	Criar e coletar um vetor [50] inteiro. Calcular e exibir:
    a.	A média dos valores entre 10 e 200;
    b.	A soma dos números ímpares.

 * 
 */
import javax.swing.JOptionPane;
public class LT02_HomoVet01 {
    public static void main(String[] args) {
        int Imp, c, S_m, i, S;
        double M;
        int Vet[] = new int[50];
        
        c = 0;
        S_m = 0;
        S = 0;
        for(i = 0; i < 10; i++){
            Vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if(Vet[i] >= 10 && Vet[i] <= 200){
                c = c + 1;
                S_m = S_m + Vet[i];
            }
            Imp = Vet[i]%2;
            if(Imp == 1){
                S = S + Vet[i];
            }
        }
        M = S_m/c;
        JOptionPane.showMessageDialog(null, "A média calculada é "+M);
        JOptionPane.showMessageDialog(null, "A soma dos ímpares é "+S);
            
    }
}
