package br.unb.poo.estoque.main;


import br.unb.poo.estoque.dto.ProdutoDTO;
import br.unb.poo.estoque.dto.Response;
import br.unb.poo.estoque.exception.PrecoInvalidoException;
import br.unb.poo.estoque.exception.QuantidadeInvalidaException;
import br.unb.poo.estoque.service.ProdutoService;

public class Main {

	public static void main(String[] args) {
		
		var service = new ProdutoService();
		
		try {
			
			var productDTO = service.cadastrarProduto("Arroz", 7.0, 100);
			
			Response<ProdutoDTO> criado = Response.<ProdutoDTO>builder()
				.sucesso(true)
				.mensagem("Criado com Sucesso")
				.dados(productDTO)
				.build();
			
			System.out.println(criado);
			
		} catch (PrecoInvalidoException | QuantidadeInvalidaException e) {
			
			Response<Void> erro = Response.<Void>builder()
					.mensagem(e.getMessage())
					.sucesso(false)
					.build();
			
			System.err.println(erro);
		}

	}

}
