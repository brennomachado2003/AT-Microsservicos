package com.exemplo.fornecedorservice.config;

import com.exemplo.fornecedorservice.model.Fornecedor;
import com.exemplo.fornecedorservice.repository.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Popula o banco H2 em memoria com forecedores de teste assim que a aplicacao sobe.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final FornecedorRepository fornecedorRepository;

    public DataInitializer(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public void run(String... args) {
        fornecedorRepository.save(new Fornecedor("Ana Souza", "11.111.111/0001-11"));
        fornecedorRepository.save(new Fornecedor("Bruno Lima", "22.222.222/0001-22"));
        fornecedorRepository.save(new Fornecedor("Carla Mendes", "33.333.333/0001-33"));
        fornecedorRepository.save(new Fornecedor("Diego Rocha", "44.444.444/0001-44"));
        fornecedorRepository.save(new Fornecedor("Elisa Prado", "55.555.555/0001-55"));
    }
}
