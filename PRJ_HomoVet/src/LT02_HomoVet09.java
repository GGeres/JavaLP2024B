/**
 *
 * @author Gustavo
 * LT02_HomoVet09
 * 18/09/2024
 * 9.	Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a 
 *      diagonal principal terá seus dados carregados no programa segundo:

 * 
 * 
 */
import javax.swing.JOptionPane;
public class LT02_HomoVet09 {
    public static void main(String[] args) {
        int x, y, z;
        int M[][] = new int[4][4];
        x = 0;
        y = 0;
        
        z = 1;
        M[x][y] = z;
        for(x = 0; x < 4; x++){
            for(y = 1; y < 4; y++){
                if (x == y) {
                    z = z * 4;
                    M[x][y] = z;
                } else{
                    M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
                }
            }
        }
    }
}
