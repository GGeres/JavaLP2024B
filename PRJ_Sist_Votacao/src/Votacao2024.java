import java.io.*;
import javax.swing.*;
public class Votacao2024 {
    public Votacao [ ] CadastroVotacao(Votacao[] vot) throws IOException{
        int x;
        String fileName = "ArquivoVotos.txt";
        BufferedWriter save = new BufferedWriter(new FileWriter(fileName));
        for(x = 0; x < 5; x++){
            vot[x] = new Votacao();
        }
        x = 0;
        while(x < 5){
            vot[x].NumeroSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção"));
            vot[x].NumeroCandidato = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Candidato"));
            
            if((vot[x].NumeroSecao <= 10) && (vot[x].NumeroSecao > 0)){
                save.write(Integer.toString(vot[x].NumeroSecao));
                save.newLine();
                x++;
            } else{
                JOptionPane.showMessageDialog(null, "Dados Errados! Digite um número de seção válido");
                if(x > 0){
                    x = x - 1;
                } else{
                    x = 0;
                }
            }
            if((vot[x].NumeroCandidato <= 300) && (vot[x].NumeroCandidato >= 1)){
                save.write(Integer.toString(vot[x].NumeroCandidato));
                save.newLine();
                x++;
            } else{
                JOptionPane.showMessageDialog(null, "Dados Errados! Digite um número de candidato válido");
                if(x > 0){
                    x = x - 1;
                } else{
                    x = 0;
                }
            }
            
        }
        System.out.println("GRAVACAO FEITA COM SUCESSO ");
        save.close();
        return vot;   
    }
}
