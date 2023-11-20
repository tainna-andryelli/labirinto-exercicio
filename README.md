# Labirinto
- Aplicando conhecimentos de lógica de programação, manipulação de arquivos, recursividade e orientação a objetos em um exercício sobre um labirinto utilizando a linguagem Java.

## Imagem
![Labirinto](https://github.com/tainna-andryelli/labirinto-exercicio/assets/76691875/10886e80-89ea-4e5f-bc03-5f4d019ba88c)


## Descrição:
- Crie uma classe em Java chamada Labirinto. Ela deve conter um **array bidimensional de caracteres** que irá armazenar o Labirinto, um método chamado **criaLabirinto** e um método chamado **percorreLabirinto.** 
- Para criação do labirinto, seu programa deve ler um arquivo com extensão txt que contém os caracteres correspondentes do labirinto. Depois de ler o arquivo, você deve passar o conteúdo para um array bidimensional de caracteres. A entrada do labirinto será sempre a posição [0][0] do array.
- Um exemplo de Labirinto: ![image](https://github.com/tainna-andryelli/labirinto-exercicio-java/assets/76691875/28d92e91-b24b-4db1-b1ae-8aeb1d19a9b9) 
- No Labirinto, posições com X indicam que não é possível passar, enquanto posições com ' ' (espaço) indicam que é possível a passagem. O local de destino está marcado no labirinto com a letra 'D'.
- Na classe Labirinto, o método **criaLabirinto** recebe uma String filename que corresponde a um arquivo txt que contém a estrutura do labirinto. Esse método abre o arquivo para leitura e preenche o labirinto.
- O método **percorreLabirinto** deve ser criado para andar no labirinto. Retorna verdadeiro, caso haja pelo menos uma saída para este labirinto, ou falso caso contrário. No entanto, este método deve ser recursivo.
 
