import java.util.Locale;
import java.util.Scanner;

public class TesteIMC {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe sua altura: ");
        Double altura = scanner.nextDouble();

        System.out.println("Informe seu peso: ");
        Double peso = scanner.nextDouble();

        Double IMC = peso / (altura * altura);

        System.out.println("Olá, aqui estão suas informações: ");
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("IMC: " + IMC);
    }

}
