package exercicios_iniciais;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando = scanner.nextLine();

        String status = (comando.equals("START") || comando.equals("STOP") || comando.equals("RESTART")
        				? "Command accepted" : "Command rejected");
        					
        System.out.println(status);

        scanner.close();

	}

}
