import java.io.*;
import javax.swing.*;
public class Votacao2024 {
    public Votacao [ ] CadastroVotacao(Votacao[] vot) throws IOException{
        int x;
        String fileName = "ArquivoVotos.txt";
        BufferedWriter save = new BufferedWriter(new FileWriter(fileName));
        for(x = 0; x < 4; x++){
            vot[x] = new Votacao();
        }
        for(x = 0; x < 4; x++){
            vot[x].NumeroSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção"));
                save.write(Integer.toString(vot[x].));
        }
        
        
    }
}
