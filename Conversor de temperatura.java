
// Main
import java.util.Scanner;

public class Atividade3_ConversorTemperatura {
    static void main() {
       Scanner scanner = new Scanner(System.in);
       
        int celsius;
        int escolha;
        int escolha2;
        int recorrencia = 1;
        double resultado = 0;

        do {
            System.out.println("Seja bem vindo(a) ao conversor de temperatura!");
            System.out.println("Digite a temperatura que deseja converter: ");
            celsius = scanner.nextInt();
            System.out.println("Para qual escala você deseja converter essa temperatura?");
            System.out.println("1 - Fahrenheit");
            System.out.println("2 - Kelvin");
            escolha = scanner.nextInt();

                switch (escolha) {
                    case(1): resultado = (celsius * 1.8) + 32; break;
                    case(2): resultado = celsius + 273; break;
                }
                    System.out.println("A conversão fica: " + resultado);

                         System.out.println("Você deseja: ");
                         System.out.println("1 - Continuar");
                         System.out.println("0 - Sair");
                         escolha2 = scanner.nextInt();
                         
                                switch (escolha2) {
                                    case(1): System.out.println("Continuando..."); break;
                                    case(0): System.out.println("Até mais!"); recorrencia = 0; break;
                                }
                                
        } while (recorrencia == 1);

    }
}
