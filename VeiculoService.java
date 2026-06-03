package com.estoque.service;
import com.estoque.model.Veiculo;
import com.estoque.repository.VeiculoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class VeiculoService{
 private final VeiculoRepository repository;
 public VeiculoService(VeiculoRepository repository){this.repository=repository;}
 public List<Veiculo> listarTodos(){return repository.findAll();}
 public Veiculo buscarPorId(Long id){return repository.findById(id).orElse(null);}
 public Veiculo salvar(Veiculo v){return repository.save(v);}
 public Veiculo atualizar(Long id,Veiculo novo){
  Veiculo v=repository.findById(id).orElseThrow();
  v.setMarca(novo.getMarca()); v.setModelo(novo.getModelo());
  v.setAno(novo.getAno()); v.setCor(novo.getCor());
  v.setPreco(novo.getPreco()); v.setQuilometragem(novo.getQuilometragem());
  v.setStatus(novo.getStatus());
  return repository.save(v);
 }
 public void deletar(Long id){repository.deleteById(id);}
}