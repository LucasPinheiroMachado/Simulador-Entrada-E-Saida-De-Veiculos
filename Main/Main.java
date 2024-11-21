package Main;

import Hardwares.*;
import Infraestrutura.*;
import Controlador.*;
import java.util.Scanner;

public class Main {
	public static void limparTela() {
	    for (int i = 0; i < 100; i++) {
	        System.out.println();
	    }
	}
	public static void main(String[] args) {
	    BracoMecanico bracoMecanico = new BracoMecanico(false);
	    PainelDeLed painelVerde = new PainelDeLed(true, "Verde");
	    PainelDeLed painelVermelho = new PainelDeLed(true, "Vermelho");
	    AutoFalante autoFalante = new AutoFalante(false);
	    
	    Cancela cancela = new Cancela(bracoMecanico);
	    Semaforo semaforoInterno = new Semaforo(painelVerde, painelVermelho);
	    Semaforo semaforoExterno = new Semaforo(painelVerde, painelVermelho);
	    Sirene sirene = new Sirene(autoFalante);
	    
	    ControladorDeEntradaSaida controlador = new ControladorDeEntradaSaida(sirene, semaforoInterno, semaforoExterno, cancela);
	    
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Entrada de veículo");
            System.out.println("2 - Saída de veículo");
            System.out.println("3 - Encerramento de entrada/saída de veiculo");
            System.out.println("4 - Ver estado dos dispositivos");
            System.out.println("5 - Sair do sistema");
            
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    controlador.entrada();
                    System.out.println("Entrada realizada.");
                    break;
                case 2:
                    controlador.saida();
                    System.out.println("Saída realizada.");
                    break;
                case 3:
                    controlador.encerramento();
                    System.out.println("Sistema encerrado.");
                    break;
                case 4:
                    String estadoCancela = cancela.verEstado();
                    String estadoSemaforoInterno = semaforoInterno.verEstado();
                    String estadoSemaforoExterno = semaforoExterno.verEstado();
                    String estadoSirene = sirene.verEstado();
                    System.out.println("Cancela: " + estadoCancela + " | " +
                    				   "Semaforo Interno: " + estadoSemaforoInterno + " | " + 
                    				   "Semaforo Externo: " + estadoSemaforoExterno + " | " +
                    				   "Sirene: " + estadoSirene);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    limparTela();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
