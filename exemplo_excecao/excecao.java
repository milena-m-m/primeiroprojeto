
package exemplo_excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecao {
    public static void main(String[] args) {
        metodo1();
        System.out.println("fim do programa");
    }
      public static void metodo1(){
          System.out.println("Iniciando metodo 1");
          metodo2();
          System.out.println("Fim do metodo 1");
      }
        public static void metodo2(){
            System.out.println("Iniciando metodo 2");
          Scanner sc = new Scanner(System.in);

        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);

        } catch (InputMismatchException e) {
            System.out.println("Não existe indice com letras");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice inexistente");
        }
            System.out.println("Fim do metodo 2");
        }
       

    }


