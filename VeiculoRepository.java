package com.estoque.repository;
import com.estoque.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface VeiculoRepository extends JpaRepository<Veiculo,Long>{
 List<Veiculo> findByMarca(String marca);
 List<Veiculo> findByModelo(String modelo);
 List<Veiculo> findByAno(Integer ano);
 List<Veiculo> findByStatus(String status);
}