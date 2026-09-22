package edu.unifio.br.ecommerce.Repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.unifio.br.ecommerce.entidades.Pedido;
import edu.unifio.br.ecommerce.repositorios.PedidoRepositorio;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PedidoRepositorioTests {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Test
    public void deveBuscarUmPedidoPorId() {
        Pedido pedido = pedidoRepositorio.findById(1).orElseThrow();

        assertNotNull(pedido);
        assertEquals("CONCLUIDO", pedido.getStatus());
        assertEquals(0, new BigDecimal("73.44").compareTo(pedido.getValorTotal()));
        
        assertEquals("Maria Silva", pedido.getCliente().getNome());
    }

    @Test
    public void deveListarTodosOsPedidos() {
        List<Pedido> pedidos = pedidoRepositorio.findAll();

        assertNotNull(pedidos);
        assertEquals(5, pedidos.size());
        long pendentes = pedidos.stream().filter(p -> p.getStatus().equals("PENDENTE")).count();
        assertEquals(1, pendentes);
    }
}