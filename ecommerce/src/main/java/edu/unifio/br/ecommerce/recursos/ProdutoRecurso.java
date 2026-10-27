package edu.unifio.br.ecommerce.recursos;

import edu.unifio.br.ecommerce.repositorios.PedidoRepositorio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.health.actuate.endpoint.HttpCodeStatusMapper;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unifio.br.ecommerce.entidades.Produto;
import edu.unifio.br.ecommerce.repositorios.ProdutoRepositorio;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


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





@GetMapping ("{id}")
public Optional<Produto> buscarPorId (@PathVariable Integer id) {
  return ProdutoRepositorio.findById(id);
}


@PostMapping
@ResponseStatus (HttpStatus.CREATED) 
public Produto salvar (@RequestBody  Produto produto) {
  return ProdutoRepositorio.save(produto);
}
@DeleteMapping ("{id}")
@ResponseStatus (HttpStatus.NO_CONTENT)
public void excluirPorId (@PathVariable Integer id) {
   ProdutoRepositorio.deleteById(id);
} 

}


