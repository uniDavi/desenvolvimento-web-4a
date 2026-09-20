package edu.unifio.br.ecommerce.entidades;

import java.math.BigDecimal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Itempedido {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)


private Integer id;
private Integer quantidade;
private BigDecimal valorUnitario;


@ManyToOne
private Pedido pedido;

@ManyToOne
private Produto produto;


}
