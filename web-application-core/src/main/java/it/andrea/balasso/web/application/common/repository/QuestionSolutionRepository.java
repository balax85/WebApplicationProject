package it.andrea.balasso.web.application.common.repository;

import it.andrea.balasso.web.application.common.entity.QuestionSolution;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableTransactionManagement
@Transactional(value = "springProjectTxManager")
public interface QuestionSolutionRepository extends CrudRepository<QuestionSolution, Long> {

}
