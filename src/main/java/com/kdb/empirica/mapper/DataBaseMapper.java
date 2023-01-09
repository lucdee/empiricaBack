package com.kdb.integracaoDB2.api.mapper;

import java.util.List;

import com.kdb.integracaoDB2.api.dto.CartaoDTO;
import com.kdb.integracaoDB2.model.CartaoPS;

public interface CartaoMapper {

	/**
	 * Faz a conversão de um objeto CartaoPS para um CartaoDTO
	 * @param CartaoPS
	 * @return CartaoDTO com as informações do cartão passado por parâmetro. Se o parâmetro for null, 
	 * será retornado valor null.
	 */
	CartaoDTO mapToDTO(CartaoPS cartao);
	
	/**
	 * Converter uma lista de CartaoPS em uma lista de CartaoDTO.
	 * @param listaCartoes
	 * @return listaCartaoDTO
	 */
	List<CartaoDTO> mapToDTO(List<CartaoPS> listaCartoes);
}
