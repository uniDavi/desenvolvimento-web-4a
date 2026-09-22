package edu.unifio.br.ecommerce.Repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.unifio.br.ecommerce.entidades.Cliente;
import edu.unifio.br.ecommerce.repositorios.ClienteRepositorio;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ClienteRepositorioTests {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void deveBuscarUmClientePorId() {
        Cliente cliente = clienteRepositorio.findById(1).orElseThrow();

        assertNotNull(cliente);
        assertEquals("Maria Silva", cliente.getNome());
        assertEquals("maria.silva@email.com", cliente.getEmail());
    }

    @Test
    public void deveListarTodosOsClientes() {
        List<Cliente> clientes = clienteRepositorio.findAll();

        assertNotNull(clientes);
        assertEquals(5, clientes.size());
        assertTrue(clientes.stream().anyMatch(c -> c.getNome().equals("Carlos Lima")));
    }
}