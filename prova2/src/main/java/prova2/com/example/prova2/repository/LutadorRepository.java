package prova2.com.example.prova2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prova2.com.example.prova2.entidade.Lutador;

import java.util.List;

public interface LutadorRepository extends JpaRepository <Lutador,Integer>{

    List<Lutador> findAllOrderByForcaGolpe(Double ForcaGolpe);

}
