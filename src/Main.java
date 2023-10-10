import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculaMedia aluno = new CalculaMedia();

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        double mediaAprovacao = 7.0;
        double mediaReposicao = 5.0;


       double mediaGeral = aluno.divideMedia(nota1, nota2, nota3, nota4);
       System.out.printf("Sua média é: %.2f \n" , mediaGeral);

        if (mediaGeral >= mediaAprovacao) {
            System.out.println("Aprovado!");
        } else if (mediaGeral < mediaAprovacao && mediaGeral >= mediaReposicao) {
            System.out.println("Em recuperação!");
        } else {
            System.out.println("Reprovado!");
        }




    }
}