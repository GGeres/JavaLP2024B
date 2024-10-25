import java.io.*;
import javax.swing.*;
import java.util.Random;

//Classe de Métodos

public class Votacao2024 {
    
    //Funções do Menu Principal
    //1 - Carregar Seção/Número Eleitor
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
    
    //2 - Classificar por Seção
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
    
    //3 - Gravar Registros
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
    
    
    //Procedimentos para a Opção 4 do Menu Principal
    //4.1 - Eleitores por Seção
    int somaSecao[] = new int[10];
    public void PEleitoresSecao(Votacao [] vot) throws IOException{
        int i,j;
        String fileName = "ArquivoVotos.txt";
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        for(i = 0; i < 200; i++){
            vot[i].NumeroSecao = Integer.parseInt(read.readLine());
            vot[i].NumeroCandidato = Integer.parseInt(read.readLine());
        }
        
        for(i = 0; i < 9; i++){
            for(j = (i+1); j < 10; j++){
                if(vot[i].NumeroSecao == vot[j].NumeroSecao){
                    somaSecao[i] = somaSecao[i] + 1;
                }    
            }  
        }
        for(i = 0; i < 10; i++){
            System.out.println("Na Secao "+(i+1)+" houveram "+somaSecao[i]+" eleitores.");
        }
    }
    //4.2 - Seção com Maior e Menor Número de Eleitores
    public void PMaiorMenorNumero(Votacao [] vot) throws IOException{
        Votacao aux[] = new Votacao[1];
        int i,j;
        String fileName = "ArquivoVotos.txt";
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        for(i = 0; i < 200; i++){
            vot[i].NumeroSecao = Integer.parseInt(read.readLine());
            vot[i].NumeroCandidato = Integer.parseInt(read.readLine());
        }
        for(i = 0; i < 9; i++){
            for(j = (i + 1); j < 10; j++){
                if(somaSecao[i] > somaSecao[j]){
                    aux[0] = vot[i];
                    vot[i] = vot[j];
                    vot[j] = aux[0];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Seção com mais votos: "+Integer.toString(vot[0].NumeroSecao)+"\n"
                + "Seção com menos votos: "+Integer.toString(vot[9].NumeroSecao));
        /*
        int Big = 0;
        int Low = 10*100000;
        for(i = 0; i < 10; i++){
            if(somaSecao[i] > Big){
                Big = somaSecao[i];
                aux[0] = vot[i];
            }
        }
        for(i = 0; i < 10; i++){
            if(somaSecao[i] < Low){
                Low = somaSecao[i];
                aux[1] = vot[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Seção com mais votos: "+Integer.toString(aux[0].NumeroSecao)+"\n"
                + "Seção com menos votos: "+Integer.toString(aux[1].NumeroSecao));
        */
        
        
        /*int optBigLow = Integer.parseInt(JOptionPane.showInputDialog("1 - Seção com mais Votos "
                                                                    + "\n2 - Seção com menos votos"));
        int Big = 0;
        int Low = 10^1000;
        switch (optBigLow){
            case 1:
                for(i = 0; i < 10; i++){
                    if(somaSecao[i] > Big){
                        Big = somaSecao[i];
                        aux[0] = vot[i];
                    } 
                }
                JOptionPane.showMessageDialog(null,"Seção "+Integer.toString(aux[0].NumeroSecao)); 
                break;
            case 2:
                for(i = 0; i < 10; i++){
                    if(somaSecao[i] < Low){
                        Low = somaSecao[i];
                        aux[0] = vot[i];
                    }
                }
                JOptionPane.showMessageDialog(null, "Seção "+Integer.toString(aux[0].NumeroSecao));
                break;
        }*/               
    }
    //4.3 - Quantidade de votos por candidato
   
    
    
}
