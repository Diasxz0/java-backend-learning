package br.unb.poo.estoque.service;

import br.unb.poo.estoque.mapper.ProdutoMapper;
import br.unb.poo.estoque.model.Produto;
import br.unb.poo.estoque.exception.QuantidadeInvalidaException;
import java.util.concurrent.ThreadLocalRandom;
import br.unb.poo.estoque.dto.ProdutoDTO;


public class ProdutoService {

	private ProdutoMapper mapper = ProdutoMapper.INSTANCE;
	
	public ProdutoDTO cadastrarProduto(String nome, Double i, Integer quantidade) {
		
		if (quantidade <= 0) {
			throw new QuantidadeInvalidaException("A quantidade inserida nao é valida");
		} 
		
		Long NovoId = ThreadLocalRandom.current().nextLong(1, 10000);
		
		Produto produto = new Produto(NovoId, nome, i, quantidade);
	
		ProdutoDTO produtoDTO = mapper.toDTO(produto);
		
		return produtoDTO;
		
		
	}
}
