package edu.unifio.br.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifio.br.ecommerce.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Integer> {
}
