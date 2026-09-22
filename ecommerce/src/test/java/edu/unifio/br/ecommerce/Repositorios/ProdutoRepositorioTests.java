package edu.unifio.br.ecommerce.Repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.unifio.br.ecommerce.entidades.Produto;
import edu.unifio.br.ecommerce.repositorios.ProdutoRepositorio;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProdutoRepositorioTests {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Test
    public void deveBuscarUmProdutoPorId() {
        Produto produto = produtoRepositorio.findById(1).orElseThrow();

        assertNotNull(produto);
        assertEquals("codigo limpo", produto.getNome());
        assertEquals(0, new BigDecimal("73.44").compareTo(produto.getPreco()));
        
        assertEquals("Livros", produto.getCategoria().getNome());
    }

    @Test
    public void deveListarTodosOsProdutos() {
        List<Produto> produtos = produtoRepositorio.findAll();

        assertNotNull(produtos);
        assertEquals(5, produtos.size());
        assertTrue(produtos.stream().anyMatch(p -> p.getNome().equals("Mouse Gamer")));
    }
}
