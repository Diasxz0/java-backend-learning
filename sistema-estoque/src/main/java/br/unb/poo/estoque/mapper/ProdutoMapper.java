package br.unb.poo.estoque.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.unb.poo.estoque.dto.ProdutoDTO;
import br.unb.poo.estoque.model.Produto;


@Mapper

public interface ProdutoMapper {

	ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);
	
	ProdutoDTO toDTO (Produto product);
	
	Produto toEntity (ProdutoDTO productDTO);
}
