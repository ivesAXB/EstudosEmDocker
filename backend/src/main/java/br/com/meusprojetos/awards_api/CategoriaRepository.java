package br.com.meusprojetos.awards_api;

// Pacote da sua aplicação

import org.springframework.data.jpa.repository.JpaRepository;

// Uma interface é um "contrato".
// Nós estendemos JpaRepository, que nos dá todos os comandos do banco.
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
    // <Categoria, Long> significa: 
    // "Este repositório gerencia a entidade 'Categoria', 
    // e o ID dela é do tipo 'Long'".
    
    // NÃO PRECISA ESCREVER MAIS NADA AQUI!
    // O Spring Data JPA já nos deu os métodos:
    // .save() (para salvar/atualizar)
    // .findById() (para buscar um)
    // .findAll() (para buscar todos)
    // .deleteById() (para apagar)
}