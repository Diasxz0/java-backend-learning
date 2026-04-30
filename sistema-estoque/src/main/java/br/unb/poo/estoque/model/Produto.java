package br.unb.poo.estoque.model;

import br.unb.poo.estoque.exception.PrecoInvalidoException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Produto {
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    
    public void atualizarPreco(Double PrecoAntigo, Double PrecoNovo) {
    	
    	if (!PrecoAntigo.equals(this.preco) || PrecoNovo <= 0) {
    		throw new PrecoInvalidoException("Preço antigo errado ou preço novo inválido ");
    	}
    	
    	this.preco = PrecoNovo;
    }
}