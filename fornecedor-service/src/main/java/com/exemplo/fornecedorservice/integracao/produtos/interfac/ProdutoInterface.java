package com.exemplo.fornecedorservice.integracao.produtos.interfac;

import com.exemplo.fornecedorservice.integracao.produtos.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name="produtos-service")
public interface ProdutoInterface {
    
    @GetMapping("/produtos")
    List<ProdutoDTO> listarTodos();
}
