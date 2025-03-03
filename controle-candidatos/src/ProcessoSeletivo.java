import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.io.IOException;
public class ProcessoSeletivo {
    static String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana", "Fernando", "Marta", "Rafael", "Camila", "Gustavo", "Larissa", "Rodrigo", "Carolina", "Felipe", "Aline"};
    static String [] candidatosSelecionados = new String[5];
    
    public static void main(String[] args) {
        
        System.out.println("--------------- PROCESSO SELETIVO ---------------");
        selecaoCandidatos();
        imprimirCandidatosSelecionados(candidatosSelecionados);
        System.out.println("------------------------------------------------");
        System.out.println("--------------- ENTRANDO EM CONTATO ---------------");
        for (String candidato : candidatosSelecionados) {
            entrarEmContato(candidato);
        }
        System.out.println("------------------------------------------------");
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardar resultado dos demais candidatos");
        }
    }
    static void selecaoCandidatos() {
        
        int candidatosSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionado < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(1800.0, 2500.0);

            
            if(salarioPretendido <= salarioBase) {
                candidatosSelecionados[candidatosSelecionado] = candidato;  
                candidatosSelecionado++;
            }
            candidatosAtual++;
        }
                
    }
    static void imprimirCandidatosSelecionados(String[] candidatosSelecionados) {
        for (String candidato : candidatosSelecionados) {
            if(candidato != null) {
            System.out.println(candidato + " foi selecionado(a)");
            }
        }
    }
    static void entrarEmContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{ 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) 
                tentativas++;
        }while(continuarTentando && tentativas <= 3);
        
        if(candidato != null) {
            if(atendeu) {
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativas + "ª tentativa");
            } else {
                System.out.println("Não foi possível entrar em contato com " + candidato);
            }
        }
        

    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}
    

