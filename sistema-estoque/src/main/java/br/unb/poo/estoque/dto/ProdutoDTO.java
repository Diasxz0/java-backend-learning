package br.unb.poo.estoque.dto;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class ProdutoDTO {
	
	private String nome;
	private Double preco;
    private Integer quantidade;

}
