package teste2;
import java.util.Scanner;
public class SequenciaFibonacci {

	public static void main(String[] args) {
		int valor,anterior =0,atual=1,aux =0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("SEQUÊNCIA DE FIBONACCI\nDigite um número inteiro não negativo");
        valor = entrada.nextInt();
        
        switch(valor){
            case 0 -> System.out.println("O número "+valor+" faz parte da sequência de fibonacci");
            case 1 -> System.out.println("O número "+valor+" faz parte da sequência de fibonacci");
                
            default -> {
                while(valor != atual && atual <= valor){
                    aux = atual;
                    atual += anterior;
                    anterior = aux;
                    if(valor == atual){
                        System.out.println("O número "+valor+" faz parte da sequência de fibonacci");
                    }else if(atual > valor ){
                        System.out.println("O número "+valor+" não faz parte da sequência de fibonacci");
                    }
                }
            }
        }

	}

}
