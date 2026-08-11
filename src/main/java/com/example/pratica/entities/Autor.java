package com.example.pratica.entities;


import com.example.pratica.enums.NationalityTypes;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private NationalityTypes nationality;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "autor", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Livro> livros = new ArrayList<>();
}
