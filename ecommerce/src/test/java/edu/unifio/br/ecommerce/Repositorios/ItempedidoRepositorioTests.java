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

import edu.unifio.br.ecommerce.entidades.Itempedido;
import edu.unifio.br.ecommerce.repositorios.ItempedidoRepositorio;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ItempedidoRepositorioTests {

    @Autowired
    private ItempedidoRepositorio itemPedidoRepositorio;

    @Test
    public void deveBuscarUmItempedidoPorId() {
        Itempedido item = itemPedidoRepositorio.findById(1).orElseThrow();

        assertNotNull(item);
        assertEquals(1, item.getQuantidade());
        assertEquals(0, new BigDecimal("73.44").compareTo(item.getValorUnitario()));
       
        assertEquals("codigo limpo", item.getProduto().getNome());
        assertEquals("CONCLUIDO", item.getPedido().getStatus());
    }

    @Test
    public void deveListarTodosOsItensPedido() {
        List<Itempedido> itens = itemPedidoRepositorio.findAll();

        assertNotNull(itens);
        assertEquals(5, itens.size());
        assertTrue(itens.stream().anyMatch(i -> i.getProduto().getNome().equals("Mouse Gamer")));
    }
}
