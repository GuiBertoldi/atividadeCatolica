import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite D para 'Direita' e E para esquerda: ");
        String directions = s.nextLine();
        directions = directions.toUpperCase();

        int countDireita=0;
        for (int i=0;i<directions.length();i++){
            if(directions.charAt(i)=='D'){
                countDireita++;
            }
        }

        int countEsquerda=0;
        for (int i=0;i<directions.length();i++){
            if(directions.charAt(i)=='E'){
                countEsquerda--;
            }
        }
        System.out.println("O local do trem é " + (countDireita + countEsquerda));
    }
}