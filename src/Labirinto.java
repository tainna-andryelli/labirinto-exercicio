import java.io.*;

public class Labirinto {
  private char[][] labirinto;
  private int numLinhas, numColunas;
    
  public char[][] getLabirinto() {
    return labirinto;
  }
  public int getNumLinhas() {
    return numLinhas;
  }
  public int getNumColunas() {
    return numColunas;
  }
    
  public void criaLabirinto(String filename) throws FileNotFoundException, IOException{
    try{
      BufferedReader leitorContaLinhas = new BufferedReader(new FileReader(filename));
      long quantLinhas = leitorContaLinhas.lines().count();
      int numLinhas = (int)quantLinhas;
      this.numLinhas = numLinhas;
      leitorContaLinhas.close();

      BufferedReader leitor = new BufferedReader(new FileReader(filename));
      String lerLinha = leitor.readLine(); 
      int numColunas = lerLinha.length();
      this.numColunas = numColunas;
      labirinto = new char[numLinhas][numColunas];
      int linha = 0;

      while(lerLinha != null){
        String[] separaLinha = lerLinha.split("");

        for(int coluna=0; coluna<numColunas; coluna++){
          labirinto[linha][coluna] = separaLinha[coluna].charAt(0);
        }
                    
        lerLinha = leitor.readLine();
        linha++;

      }

      leitor.close();

    } catch(IOException e){
      e.printStackTrace();
    }
  }

  public void imprimeLabirinto(){
    for(int linha=0; linha<labirinto.length; linha++){
  	  for(int coluna=0; coluna<labirinto[0].length; coluna++){
        System.out.print(labirinto[linha][coluna]);
      }
      System.out.println();
    }
    System.out.println();
  }

  public boolean percorreLabirinto() throws IllegalArgumentException{
    if(labirinto == null){
      throw new IllegalArgumentException("Labirinto não foi criado.");
    } else {
      return percorreLabirinto(0, 0); //início do Labirinto [0,0]
  }
  }

  public boolean percorreLabirinto(int linha, int coluna) {
    if (posicaoForaDoLabirinto(linha, coluna)) {
      return false;
    }

    if (labirinto[linha][coluna] == 'D') {
      System.out.println("Saída encontrada na posição ["+linha+", "+coluna+"]");
      return true;
    }

    if (labirinto[linha][coluna] == ' ') {
      sinalizaPassagem(linha, coluna);
      if (percorreLabirinto(linha - 1, coluna) || percorreLabirinto(linha + 1, coluna) || percorreLabirinto(linha, coluna - 1) || percorreLabirinto(linha, coluna + 1)) {
        return true; 
      }
    }
    
    return false;
  } 

  public boolean posicaoForaDoLabirinto(int linha, int coluna){
    if(linha < 0 || linha > numLinhas || coluna < 0 || coluna > numColunas){
      return true;
    }
    return false;
  }

  public void sinalizaPassagem(int linha, int coluna){
    labirinto[linha][coluna] = '-';
  }
}
