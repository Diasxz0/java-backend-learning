package br.unb.poo.estoque.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString

public class Response<T> {
	private String mensagem;
	private T dados;
	private boolean sucesso;
}
