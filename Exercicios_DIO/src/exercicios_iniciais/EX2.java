package exercicios_iniciais;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        String[] codigos = scanner.nextLine().split(" ");

       
        String codigoBuscado = scanner.nextLine();

        int contador = Contagem(codigos, codigoBuscado);

        System.out.println(contador);

        scanner.close();

	}
	
	public static int Contagem(String[] buscada, String buscador) {
		
		int contador = 0;
		
		for(int i = 0; i < buscada.length; i++) {
			if(buscador.equals(buscada[i])) {
				contador++;
			} 
		}
		
		return contador;
	}

}
