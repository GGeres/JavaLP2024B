import java.io.*;
import javax.swing.*;
import java.util.Random;
public class Votacao2024 {
    public Votacao [ ] CadastroVotacao(Votacao[] vot) throws IOException{
        int x;
        //String fileName = "ArquivoVotos.txt";
        //BufferedWriter save = new BufferedWriter(new FileWriter(fileName));
        for(x = 0; x < 200; x++){
            vot[x] = new Votacao();
        }
        // Gerador de números
        Random y = new Random();
        
        x = 0;
        while(x < 200){
            vot[x].NumeroSecao = y.nextInt(11);
            vot[x].NumeroCandidato = y.nextInt(301);
            //vot[x].NumeroSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção"));
            //vot[x].NumeroCandidato = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Candidato"));
            
            if(((vot[x].NumeroSecao <= 10) && (vot[x].NumeroSecao > 0)) && ((vot[x].NumeroCandidato <= 300)
                    && (vot[x].NumeroCandidato >= 1))){
                //save.write(Integer.toString(vot[x].NumeroSecao));
                //save.newLine();
                //save.write(Integer.toString(vot[x].NumeroCandidato));
                //save.newLine();
                x++;
            } /*else{
                JOptionPane.showMessageDialog(null, "Dados Errados! Digite um número de seção ou de candidato válido");
            }*/   
        }
        System.out.println("GRAVACAO FEITA COM SUCESSO ");
        //save.close();
        return vot;   
    }
    
    public Votacao [] ClassificaVot(Votacao []vot) throws IOException{
        int x, y;
        //String fileName = "ArquivoVotos.txt";
        //BufferedReader Read1 = new BufferedReader(new FileReader(fileName));
        Votacao[] aux = new Votacao[1];
        for(x = 0; x < 1; x++){
            aux[x] = new Votacao();
        }
        /*for(x = 0; x < 200;x++){
            vot[x].NumeroSecao = Integer.parseInt(Read1.readLine());
            vot[x].NumeroCandidato = Integer.parseInt(Read1.readLine());
        }*/
        for(x = 0; x < 199; x++){
            for(y = (x + 1); y < 200; y++){
                if(vot[x].NumeroSecao > vot[y].NumeroSecao){
                    aux[0] = vot[x];
                    vot[x] = vot[y];
                    vot[y] = aux[0];
                }
            }
        }
        return vot;
    }
    
    public Votacao[] GravaVot(Votacao [] vot) throws IOException{
        String fileName = "ArquivoVotos.txt";
        BufferedWriter save = new BufferedWriter(new FileWriter(fileName));
        int x;
        for(x = 0; x < 200; x++){
            save.write(Integer.toString(vot[x].NumeroSecao));
            save.newLine();
            save.write(Integer.toString(vot[x].NumeroCandidato));
            save.newLine();
        }
        save.close();
        return vot;
    }
    
    public void PEleitoresSecao(Votacao [] vot) throws IOException{
        int i,j;
        String fileName = "ArquivoVotos.txt";
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        for(i = 0; i < 200; i++){
            vot[i].NumeroSecao = Integer.parseInt(read.readLine());
            vot[i].NumeroCandidato = Integer.parseInt(read.readLine());
        }
        int somaSecao[] = new int[200];
        for(i = 0; i < 199; i++){
            for(j = (i+1); j < 200; j++){
                if(vot[i].NumeroSecao == vot[j].NumeroSecao){
                    somaSecao[i] = somaSecao[i] + 1;
                }    
            }  
        }
        for(i = 0; i < 200; i++){
            System.out.println("Na Secao "+(i+1)+" houveram "+somaSecao[i]+" eleitores.");
        }
    }
    
    
}
