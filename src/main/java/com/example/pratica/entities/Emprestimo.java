package com.example.pratica.entities;


import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Instant dateAtLoan;
    @Column(nullable = false)
    private Instant expectedReturnDate;

    @Column()
    private Instant actualReturnDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "emprestimo")
    private List<Livro> livros = new ArrayList<>();



}
