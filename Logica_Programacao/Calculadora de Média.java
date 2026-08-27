// Main

import java.util.Scanner;

public class Atividade2_CalculadoraMedia {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int n4;
        int recorrencia = 1;
        int escolha;
        double media;

        do {
            System.out.println("Seja bem vindo(a) á calculadora de média da Julia!");
            System.out.println("Digite o primeiro número: ");
            n1 = scanner.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = scanner.nextInt();
            System.out.println("Digite o terceiro número: ");
            n3 = scanner.nextInt();
            System.out.println("Digite o quarto número: ");
            n4 = scanner.nextInt();

                media = (n1 + n2 + n3 + n4) / 4;

                    System.out.println("A  média é: " + media);
                    System.out.println("O que deseja fazer? ");
                    System.out.println("1 - continuar");
                    System.out.println("0 - sair");
                    escolha = scanner.nextInt();

                        switch (escolha) {
                            case(1): System.out.println("Continuando..."); break;
                            case(0): System.out.println("Até mais!");recorrencia = 0; break;
                        }


        } while (recorrencia == 1);


    }

}
