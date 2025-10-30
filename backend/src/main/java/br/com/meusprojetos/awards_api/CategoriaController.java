package br.com.meusprojetos.awards_api;

// Pacote da sua aplicação

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias") // URL base para esta classe
public class CategoriaController {

    // 1. "Injeção de Dependência":
    // Pedimos ao Spring para "injetar" (nos dar) uma instância 
    // da "ponte" que criamos na Parte 2.
    @Autowired
    private CategoriaRepository categoriaRepository;

    // 2. ENDPOINT DE LISTAGEM (GET)
    // Quando o frontend acessar GET http://localhost:8080/api/categorias
    @GetMapping
    public List<Categoria> listarCategorias() {
        // Usamos o repositório para "Buscar Todos" e retornamos a lista.
        // O Spring magicamente transforma isso em JSON.
        return categoriaRepository.findAll();
    }

    // 3. ENDPOINT DE CRIAÇÃO (POST)
    // Quando o frontend enviar dados (POST) para http://localhost:8080/api/categorias
    @PostMapping
    public Categoria criarCategoria(@RequestBody Categoria categoria) {
        // @RequestBody: O Spring pega o JSON enviado pelo frontend
        // e o transforma em um objeto Categoria.
        
        // Usamos o repositório para "Salvar" a nova categoria no banco.
        return categoriaRepository.save(categoria);
    }
}