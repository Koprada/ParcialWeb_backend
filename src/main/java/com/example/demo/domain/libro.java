package com.example.demo.domain;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

import org.hibernate.annotations.Where;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro_koprada")

public class libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String referencia;
    private String autor;
    private double precio;
    private String ubicacion;
}
