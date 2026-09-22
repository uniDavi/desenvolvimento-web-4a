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

import edu.unifio.br.ecommerce.entidades.Pagamento;
import edu.unifio.br.ecommerce.repositorios.PagamentoRepositorio;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PagamentoRepositorioTests {

    @Autowired
    private PagamentoRepositorio pagamentoRepositorio;

    @Test
    public void deveBuscarUmPagamentoPorId() {
        Pagamento pagamento = pagamentoRepositorio.findById(1).orElseThrow();

        assertNotNull(pagamento);
        assertEquals("APROVADO", pagamento.getStatus());
        assertEquals("CARTAO_CREDITO", pagamento.getTipo());
        assertEquals(0, new BigDecimal("73.44").compareTo(pagamento.getValor()));
    }

    @Test
    public void deveListarTodosOsPagamentos() {
        List<Pagamento> pagamentos = pagamentoRepositorio.findAll();

        assertNotNull(pagamentos);
        assertEquals(5, pagamentos.size());

        // relacionamento: pagamento pendente (id 4) está ligado ao pedido também pendente
        Pagamento pendente = pagamentos.stream()
                .filter(p -> p.getStatus().equals("PENDENTE"))
                .findFirst()
                .orElseThrow();
        assertEquals("PENDENTE", pendente.getPedido().getStatus());
    }
}