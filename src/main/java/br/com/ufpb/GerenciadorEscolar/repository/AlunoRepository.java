package br.com.ufpb.GerenciadorEscolar.repository;

import br.com.ufpb.GerenciadorEscolar.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findByEmail(String email);

    List<Aluno> findAllByAtivoTrue();

    Optional<Aluno> findByIdAndAtivoTrue(Long id);

    Optional<Aluno> findByEmailAndAtivoTrue(String email);
}


