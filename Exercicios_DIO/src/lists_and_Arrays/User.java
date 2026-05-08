package lists_and_Arrays;

import java.util.Objects;

public class User {
	private String nome;
	private int code;
	
	public User() {
		super();
	
	}
	public User(String nome, int code) {
		super();
		this.nome = nome;
		this.code = code;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	@Override
	public boolean equals(final Object obj) {
		var isEqual = false;
		if(obj instanceof User user) {
			if(this == user) isEqual = true;
			if(this.code == user.code && Objects.equals(this.nome, user.nome)) isEqual = true;
		}
		return isEqual;
	
	
	}
}
