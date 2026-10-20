package edu.unifio.br.ecommerce.recursos;

import edu.unifio.br.ecommerce.repositorios.PedidoRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unifio.br.ecommerce.entidades.Produto;
import edu.unifio.br.ecommerce.repositorios.ProdutoRepositorio;

@RestController 
@RequestMapping ("produtos")
public class ProdutoRecurso {
    private final PedidoRepositorio pedidoRepositorio;
    @Autowired   
    private ProdutoRepositorio ProdutoRepositorio;

    ProdutoRecurso(PedidoRepositorio pedidoRepositorio) {
        this.pedidoRepositorio = pedidoRepositorio;
    }

    @GetMapping 
  public List<Produto> Listar () {
     return ProdutoRepositorio.findAll(Sort.by("nome"));
  }

}
