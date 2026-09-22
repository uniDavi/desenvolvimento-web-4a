package edu.unifio.br.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifio.br.ecommerce.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Integer> {
}
