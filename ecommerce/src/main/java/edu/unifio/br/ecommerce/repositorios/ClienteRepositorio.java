package edu.unifio.br.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifio.br.ecommerce.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
