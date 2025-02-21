import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo(a) ao terminal de conta bancária!\nEm seguida, informe os dados solicitados para criar sua conta.");

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o numero da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Informe sua agência(ex: 000-0): ");
        String agencia = scanner.nextLine();

        System.out.println("Informe o seu saldo bancário: ");
        Double saldo = scanner.nextDouble();

        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear");
        }

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");



        
        scanner.close();
    }
}
