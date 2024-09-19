/**
 *
 * @author Gustavo
 * LT02_HomoVet08
 * 18/09/2024
 * 8.	Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. 
 *      Calcular e exibir: 
        a.	A quantidade de cada produto vendido no mês;
        b.	A quantidade de produtos vendidos por semana;
        c.	O total de produtos vendidos no mês.

 * 
 * 
 */
import javax.swing.JOptionPane;
public class LT02_HomoVet08 {
    public static void main(String[] args) {
        int STot, x, y;
        int L[] = new int[4];
        int C[] = new int[3];
        int M[][] = new int[4][3];
        
        STot = 0;
        
        for(x = 0; x < 4; x++){
            for(y = 0; y < 3; y++){
                M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
                STot = STot + M[x][y];
            }
        }
        for(x = 0; x < 4; x++){
            for(y = 0; y < 3; y++){
                L[x] = L[x] + M[x][y];
                C[y] = C[y] + M[x][y];
            }
        }
        for(y = 0; y < 3; y++){
            JOptionPane.showMessageDialog(null, "A quantidade do produto "+(y+1)+" foi "+C[y]);
        }
        for(x = 0; x < 4; x++){
            JOptionPane.showMessageDialog(null, "A quantidade vendida na semana "+(x+1)+" foi "+L[x]);
        }
        JOptionPane.showMessageDialog(null,"A quantidade vendida no mês foi de "+STot+" produtos.");
        
    }
}
