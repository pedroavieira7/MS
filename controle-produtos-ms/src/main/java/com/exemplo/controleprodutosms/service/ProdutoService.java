package com.exemplo.controleprodutosms.service;

import java.util.List;
import java.util.Optional;

import com.exemplo.controleprodutosms.compartilhado.ProdutoDto;

public interface ProdutoService {

    ProdutoDto adicionarProduto(ProdutoDto produto);
    List<ProdutoDto> obterTodos();
    Optional<ProdutoDto> obterPorId(Integer id);
    void deletarProduto(Integer id);
    ProdutoDto atualizarProduto(Integer id, ProdutoDto produto);
    
}
