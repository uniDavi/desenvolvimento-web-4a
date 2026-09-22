package edu.unifio.br.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifio.br.ecommerce.entidades.Categorias;

public interface CategoriaRepositorio extends JpaRepository<Categorias, Short> {

}
