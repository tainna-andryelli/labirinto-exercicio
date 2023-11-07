import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    Labirinto labirinto = new Labirinto();
      try{
        labirinto.criaLabirinto("labirinto.txt");
        System.out.println("Labirinto a ser percorrido: ");
        labirinto.imprimeLabirinto();
        System.out.println("Quantidade de linhas: "+labirinto.getNumLinhas()+"\nQuantidade de colunas: "+labirinto.getNumColunas());
        if(labirinto.percorreLabirinto(0,0)){
          System.out.println("\nLabirinto percorrido: ");
          labirinto.imprimeLabirinto();
        } else {
          System.out.println("Não foi encontrada saída no Labirinto.");
        }
      } catch (FileNotFoundException e){
        System.out.println("Arquivo não encontrado.");
      } catch (IOException e){
        e.printStackTrace();
      }
  }
}
