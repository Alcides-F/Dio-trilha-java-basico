import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numerosValidos = false;
        
        while(!numerosValidos) {
            try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            
            if (num1 >= num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            
            contar(num1, num2);
            numerosValidos = true;
            } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            } 
        }
        
        scanner.close();
    }
        
    

    public static void contar(int num1, int num2) {
        int interacoes = num2 - num1;
        for (int i = 1; i <= interacoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
