package edu.unifio.br.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifio.br.ecommerce.entidades.Itempedido;

public interface ItempedidoRepositorio extends JpaRepository<Itempedido, Integer> {
}
