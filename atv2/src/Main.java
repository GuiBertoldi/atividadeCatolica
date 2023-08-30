import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite F para ter um trilho finito e I para um trilho infinito");
        String tipoTrilho = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Digite D para 'Direita' e E para esquerda: ");
        String directions = s2.nextLine();
        directions = directions.toUpperCase();

        int countDireita=0;
        for (int i=0;i<directions.length();i++){
            if(directions.charAt(i)=='D'){
                countDireita++;
                if(Objects.equals(tipoTrilho, "F") && countDireita > 10) {
                    countDireita=10;
                }
            }
        }

        int countEsquerda=0;
        for (int i=0;i<directions.length();i++){
            if(directions.charAt(i)=='E'){
                countEsquerda--;
                if(Objects.equals(tipoTrilho, "F") && countEsquerda < -2) {
                    countEsquerda=-2;
                }
            }
        }

        System.out.println("O local do trem é " + (countDireita + countEsquerda));
    }
}