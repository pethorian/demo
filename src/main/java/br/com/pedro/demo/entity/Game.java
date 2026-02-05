package br.com.pedro.demo.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long igdbId; // ID original do jogo no IGDB
    private String nome;
    private String slug;

    @Column(length = 4000)
    private String descricao; // Summary

    @Column(length = 4000)
    private String historia; // Storyline

    private String imgUrl; // Cover URL
    private String urlCapaGrande; // Big Cover URL

    private LocalDate dataLancamento;
    private Integer ano;

    private Double pontuacao;
    private Integer totalAvaliacoes;

    private String desenvolvedora;
    private String publicadora;

    @ManyToMany
    private List<Genero> generos;

    @ManyToMany
    private List<Plataforma> plataformas;

    @ManyToMany
    private List<ModoDeJogo> modosDeJogo;

    @ManyToMany
    private List<Screenshot> screenshots;
}
