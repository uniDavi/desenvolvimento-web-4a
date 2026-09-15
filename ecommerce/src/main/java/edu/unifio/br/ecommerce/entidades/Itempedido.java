package edu.unifio.br.ecommerce.entidades;

import java.math.BigDecimal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Itempedido {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)


private Integer id;
private Integer quantidade;
private BigDecimal ValorUnitario;
private Short estoque;
private BigDecimal preco;

@ManyToOne
private Pedido pedido;
private Produto produto;


}
