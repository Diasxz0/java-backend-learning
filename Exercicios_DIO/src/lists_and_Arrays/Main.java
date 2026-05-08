package lists_and_Arrays;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		
		List<Integer> lista = new ArrayList<>();
		
		var listaStart = OffsetDateTime.now();
		
		
		for(int i = 0; i < 100_000_000; i++) lista.add(i);
		
		System.out.println(Duration.between(listaStart, OffsetDateTime.now()).toMillis());
		
		
		List<Integer> vector = new Vector<>();
		
		var vectorStart = OffsetDateTime.now();
		
		for(int i = 0; i < 100_000_000; i++) vector.add(i);
		
		System.out.println(Duration.between(vectorStart, OffsetDateTime.now()).toMillis());
		

	}

}
