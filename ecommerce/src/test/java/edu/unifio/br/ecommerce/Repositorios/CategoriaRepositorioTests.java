package edu.unifio.br.ecommerce.Repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.unifio.br.ecommerce.entidades.Categorias;
import edu.unifio.br.ecommerce.repositorios.CategoriaRepositorio;

@SpringBootTest 
@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class CategoriaRepositorioTests {
@Autowired 
    private CategoriaRepositorio categoriaRepositorio;
    
    @Test 
public void deveBuscarUmaCategoriaPorId () {
  Categorias categoria = categoriaRepositorio.findById(Short.parseShort("2")).orElseThrow();

 assertNotNull(categoria); 
assertEquals("Eletrônicos", categoria.getNome());

}
}

