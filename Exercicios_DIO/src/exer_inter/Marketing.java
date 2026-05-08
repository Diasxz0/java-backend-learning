package exer_inter;

import java.util.List;

public class Marketing {

	public static void main(String[] args) {
	
		String msgMarketing = "Promoção de 50% de desconto!";
		
		List<Comunicacao> servicos = List.of(
			msg -> System.out.println("WPP: " + msg),
			msg -> System.out.println("EMAIL: " + msg),
			msg -> System.out.println("RS: " + msg),
			msg -> System.out.println("SMS: " + msg)
				);
		
		servicos.forEach(s -> s.enviar(msgMarketing));
	}
	
}
