package br.com.meusprojetos.awards_api;

// Importações do JPA (Banco de Dados) e do Lombok (para limpar o código)
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

// @Data: Anotação MÁGICA do Lombok.
// Ela cria automaticamente todos os Getters, Setters, 
// construtores, toString(), etc. para você.
@Data 
@Entity // Diz ao Spring: "Esta classe é uma tabela no banco de dados"
public class Categoria {

    @Id // Marca este campo como a "Chave Primária" (PK) da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz ao banco: "Use auto-incremento"
    private Long id;

    private String titulo; // Ex: "Quem mais pescou no ano?"
    private String premio; // Ex: "Troféu Isca de Ouro"

}