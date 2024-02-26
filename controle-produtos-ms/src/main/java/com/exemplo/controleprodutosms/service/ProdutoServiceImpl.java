package com.exemplo.controleprodutosms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.text.html.Option;

import com.exemplo.controleprodutosms.compartilhado.ProdutoDto;
import com.exemplo.controleprodutosms.model.Produto;
import com.exemplo.controleprodutosms.repository.ProdutoRepository;

public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    private ProdutoRepository repo;

    @Override
    private ProdutoDto adicionarProduto(ProdutoDto produto){
        return salvarProduto(produto);

    }

    @Override
    public List<ProdutoDto> obterTodos(){
        List<Produto> produtos = repo.findAll();

        return produtos.stream()
        .map(produto -> new ModelMapper().map(produto, ProdutoDto.class))
        .collect(Collectors.toList());
    }

    @Override
    public Optional<ProdutoDto> obterPorId(Integer id){

        Optional<Produto> produto = repo.findById(id);

        if(produto.isPresent()){

            ProdutoDto dto = new ModelMapper().map(produto.get(), ProdutoDto.class);
           
            return Optional.of(dto);
        
        }

        return Optional.empty();
    }

    @Override
    public void deletarProduto(Integer id){
        repo.deleteById(id);
    }

    @Override
    public ProdutoDto atualizarProduto(Integer id, ProdutoDto produto){
        produto.setId(id);
        return salvarProduto(produto);
    }

    private ProdutoDto salvarProduto(ProdutoDto produto){
        ModelMapper mapper = new ModelMapper();
        Produto produtoEntidade = mapper.map(produto, Produto.class);
        produtoEntidade = repo.save(produtoEntidade);

        return mapper.map(produtoEntidade, Produto.class);
    }



}
