package org.example.domain;
import java.util.HashSet;
import java.util.Set;

import lombok.*;

import org.hibernate.annotations.Where;

import javax.persistence.*;
@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "libro")

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
