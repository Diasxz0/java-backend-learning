package exercicios_iniciais;

import java.util.Scanner;

public class EX1 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite nome e idade (separados por espaço):");
	        String entradaRaw = scanner.nextLine();

	        String partes[] = entradaRaw.split(" ");

	        
	        String cadastro = (partes.length < 2) 
	            ? "Cadastro reprovado" 
	            : validarCadastro(partes);

	        System.out.println(cadastro);
	        scanner.close();
	    }

	  
	    public static String validarCadastro(String[] partes) {
	        try {
	            String nome = partes[0];
	            int idade = Integer.parseInt(partes[1]);

	           
	            return (idade >= 18 && !nome.isEmpty()) 
	                ? "Cadastro aprovado" 
	                : "Cadastro reprovado";
	        } catch (NumberFormatException e) {
	            return "Cadastro reprovado";
	        }
	    }
	}


