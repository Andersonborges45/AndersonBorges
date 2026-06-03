package com.estoque.controller;
import com.estoque.model.Veiculo;
import com.estoque.service.VeiculoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/veiculos")
public class VeiculoController{
 private final VeiculoService service;
 public VeiculoController(VeiculoService service){this.service=service;}
 @GetMapping public List<Veiculo> listar(){return service.listarTodos();}
 @GetMapping("/{id}") public Veiculo buscar(@PathVariable Long id){return service.buscarPorId(id);}
 @PostMapping public Veiculo salvar(@RequestBody Veiculo v){return service.salvar(v);}
 @PutMapping("/{id}") public Veiculo atualizar(@PathVariable Long id,@RequestBody Veiculo v){return service.atualizar(id,v);}
 @DeleteMapping("/{id}") public void deletar(@PathVariable Long id){service.deletar(id);}
}