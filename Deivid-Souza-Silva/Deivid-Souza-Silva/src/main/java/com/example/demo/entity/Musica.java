package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "playlist")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titulo",length = 150, nullable = false)
    private String titulo;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "ano", length = 4, nullable = false)
    private String ano;
}
