package it.andrea.balasso.web.application.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "QUESTION_SOLUTION_ACCEPTANCE")
public class QuestionSolutionAcceptance {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_QSTN_SOL_ACCEPTANCE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_QUESTION_SOLUTION", referencedColumnName = "ID")
    private QuestionSolution questionSolution;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuestionSolution getQuestionSolution() {
        return questionSolution;
    }

    public void setQuestionSolution(QuestionSolution questionSolution) {
        this.questionSolution = questionSolution;
    }
}
