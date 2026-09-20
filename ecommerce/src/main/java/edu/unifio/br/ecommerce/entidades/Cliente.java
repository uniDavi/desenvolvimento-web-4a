package edu.unifio.br.ecommerce.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer id;
private String nome;
private String email;
private String telefone;


}
