import java.util.Scanner;
public class Imagem {
    public static void main(String[] args){
        //Uso do Scanner para entrada de dados
        Scanner scan = new Scanner(System.in);
        //Declara a matriz e atribui a ela o tamanho de 16x16
        int [][] matriz= new int[16][16];
        //Informa ao usuário quais os números
        System.out.print("Digite 16 valores de cores para a matriz: 0 para branco, 1 para preto, 2 para vermelho ou 3 para bege.\n");
        //Uso da estrutura de repetição For
        for (int linha=0; linha < 16; linha++) {
            for (int coluna=0; coluna < 16; coluna++) {
                //Pede ao usuário para adicionar valores à matriz
                System.out.printf("Insira a cor do elemento M[%d][%d]: ", linha+1, coluna+1);
                //Atribui o valor digitado para cada posição na Matriz
                matriz[linha][coluna] = scan.nextInt();
            }
         }
        //Demonstra ao usuário como ficou a matriz
         System.out.println("\n A matriz ficou: \n");        
        //Uso da Estrutura de repetição For
         for (int linha=0; linha < 16; linha++) {
            for (int coluna=0; coluna < 16; coluna++) {
                //Demonstra a Matriz já montada ao usuário
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }
            System.out.println();
        }
        }
        
    }