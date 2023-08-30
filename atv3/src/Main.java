import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite o limite a esquerda do trilho (Apenas números inteiros positivos)");
        Integer posicao1 = Integer.valueOf(s1.nextLine());

        Scanner s2 = new Scanner(System.in);
        System.out.println("Digite o limite a direita do trilho (Apenas números inteiros positivos)");
        Integer posicao2 = Integer.valueOf(s2.nextLine());

        Scanner s3 = new Scanner(System.in);
        System.out.println("Digite D para 'Direita' e E para esquerda (O máximo de comandos permitidos é 30): ");
        String directions = s2.nextLine();
        directions = directions.toUpperCase();
        directions = directions.substring(0, 30);

        int countDireita=0;
        for (int i=0;i<directions.length();i++){
            if(directions.charAt(i)=='D'){
                countDireita++;
                if(countDireita > posicao2) {
                    countDireita=posicao2;
                }
            }
        }

        int countEsquerda=0;
        for (int i=0;i<directions.length();i++){
            if(directions.charAt(i)=='E'){
                countEsquerda--;
                if(countEsquerda < posicao1*-1) {
                    countEsquerda=posicao1*-1;
                }
            }
        }

        System.out.println("O local do trem é " + (countDireita + countEsquerda));
    }
}