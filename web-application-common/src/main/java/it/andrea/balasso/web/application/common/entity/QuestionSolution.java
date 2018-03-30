package it.andrea.balasso.web.application.common.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUESTION_SOLUTION")
public class QuestionSolution {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_QUESTION_SOLUTION_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "QUESTION_SOLUTION")
    private String questionSolution;

    @ManyToOne
    @JoinColumn(name = "ID_QUESTION", referencedColumnName = "ID")
    private Question question;

    @OneToMany(mappedBy = "tag", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionSolutionAcceptance> questionSolutionAcceptanceList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionSolution() {
        return questionSolution;
    }

    public void setQuestionSolution(String questionSolution) {
        this.questionSolution = questionSolution;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<QuestionSolutionAcceptance> getQuestionSolutionAcceptanceList() {
        return questionSolutionAcceptanceList;
    }

    public void setQuestionSolutionAcceptanceList(List<QuestionSolutionAcceptance> questionSolutionAcceptanceList) {
        this.questionSolutionAcceptanceList = questionSolutionAcceptanceList;
    }
}
