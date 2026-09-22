package edu.unifio.br.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifio.br.ecommerce.entidades.Pagamento;

public interface PagamentoRepositorio extends JpaRepository<Pagamento, Integer> {
}
