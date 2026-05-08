package set_use;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	
		Set<User> users = new TreeSet<>();
		users.add(new User(1, "Joao"));
		users.add(new User(5, "Pedro"));
		users.add(new User(3, "Carlos"));
		users.add(new User(4, "Lucas"));
		
		
		/*
		var iterator = users.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("----------------");
		
		System.out.println(users.removeAll(List.of(new User(1, "Joao"), new User(4, "Lucas"))));
		
		System.out.println(users);*/
		
		
		//users.removeIf(user ->user.getId() > 2);
		
		//users.removeIf(Predicate.not(user ->user.getId() > 2));
		
		System.out.println(users);


	}

}
