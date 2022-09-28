package carloseduardo.repositories;

import org.springframework.data.repository.CrudRepository;

import carloseduardo.models.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Integer> {

}