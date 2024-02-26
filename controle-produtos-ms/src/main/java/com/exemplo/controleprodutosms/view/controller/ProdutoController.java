package main.java.com.exemplo.controleprodutosms.view.controller;

import java.util.stream.Collectors;

import javax.annotation.processing.Generated;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoModeloResponse>>obterTodos(){
        List<ProdutoDto> dtos = service.obterTodos();

        if(dtos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }

        ModelMapper mapper = new ModelMapper();
        List<ProdutoModeloResponse> resp = dtos.stream()
        .map(dto -> mapper.map(dto, ProdutoModeloResponse.class))
        .collect(Collectors.toList());

        return new ResponseEntity<>(resp, HttpStatus.OK);

    }

    @GetMapping(value="/{id}")
    public ResponseEntity<ProdutoModeloResponse> obterPorId(@PathVariable Integer id){
        Optional<ProdutoDto> produto = service.obterPorId(id);

        if(produto.isPresent()){
            return new ResponseEntity<>(
                new ModelMapper().map(produto.get(), ProdutoModeloResponse ),
                HttpStatus.OK
            );
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
