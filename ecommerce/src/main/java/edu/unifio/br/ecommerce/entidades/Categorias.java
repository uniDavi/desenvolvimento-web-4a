package edu.unifio.br.ecommerce.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Categorias {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY  )
private Short id;
private String nome;
private String descricao;

}
