package br.com.teste.primeirorest.http;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.teste.primeirorest.compartilhado.AnimalDto;

@FeignClient(name = "controle-animais-ms") //interface que se comunica com o ms de animais 
public interface AnimaisFeignClient {
    
    @GetMapping(path = "/api/animais/{dono}/lista") //url que usa p acessar dentro de controle de animais
    List<AnimalDto> obterAnimais(@PathVariable Integer dono);
}
