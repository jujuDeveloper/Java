
// Main
import java.util.Scanner;

public class Atividade1_Calculadora {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        int recorrencia = 1;
        int escolha;
        double resultado = 0.0;

        System.out.println("Bem-vindo(a) á calculadora da Julia!");
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - adição");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("0 - sair");
            escolha = scanner.nextInt();

                switch (escolha) {
                    case(1): resultado = n1 + n2; break;
                    case(2): resultado = n1 - n2; break;
                    case(3): resultado = n1 * n2; break;
                    case(4): resultado = n1 / n2; break;
                    case(0): recorrencia = 0; break;
                }

                if (escolha == 0){
                    System.out.println("Até mais!");
                } else {
                    System.out.println("O resultado é: " + resultado);
                }

        } while(recorrencia == 1);

    }

}
