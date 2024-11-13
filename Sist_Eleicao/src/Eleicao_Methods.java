import java.io.*;
import javax.swing.*;
import java.util.Random;
public class Eleicao_Methods {
    public Eleitor [ ] CadastroEleitor(Eleitor [] elect) throws IOException{
        int x;
        for(x = 0; x < 10; x++){
            elect[x] = new Eleitor();
        }
        x = 0;
        while(x < 10){
            elect[x].NumEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite seu Número de Eleitor"));
            elect[x].NomeEleitor = JOptionPane.showInputDialog("Digite seu nome");
            elect[x].NumSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de sua Seção"));
            if((elect[x].NumSecao != 2 && elect[x].NumSecao != 6 && elect[x].NumSecao != 7 && elect[x].NumSecao
                    != 8) && (elect[x].NumSecao < 11)){
                x++;
            } else{
                JOptionPane.showMessageDialog(null, "Dados Errados! Digite um número de seção válido");
            }
        }
        return elect;
    }
    public Votacao [ ] CadastraVot( Votacao [] vot, Eleitor [] elect) throws IOException{
        int x;
        int opt = 0;
        for(x = 0; x < 10; x++){
            vot[x] = new Votacao();
        }
        while(opt != 9){
            opt = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Votação 1 \n2 - Cadastro Votação 2 \n9 - Voltar"));
            switch(opt){
                case 1:
                    for(x = 0; x < 10; x++){
                        if(elect[x].NumSecao < 5){
                            vot[x].Section = elect[x].NumSecao;
                            vot[x].CodCandidato = Integer.parseInt(JOptionPane.showInputDialog("1 - José\n2 - Maria\n3 - Branco\n4 - Nulo"));
                            vot[x].NEleitor = elect[x].NumEleitor;
                        }
                    }
                    break;
                case 2:
                    for(x = 5; x < 10; x++){
                        vot[x].Section = elect[x].NumSecao;
                        vot[x].CodCandidato = Integer.parseInt(JOptionPane.showInputDialog("1 - José\n2 - Maria\n3 - Branco\n4 - Nulo"));
                        vot[x].NEleitor = elect[x].NumEleitor;
                    }
                    break;
            }
        }
        return vot;
    }
}
