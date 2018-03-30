package it.andrea.balasso.web.application.core.repository;

import it.andrea.balasso.web.application.core.entity.QuestionComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableTransactionManagement
@Transactional(value = "springProjectTxManager")
public interface QuestionCommentRepository extends CrudRepository<QuestionComment, Long> {

}
