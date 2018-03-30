package it.andrea.balasso.web.application.core.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_QUESTION_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "QUESTION")
    private String question;

    @ManyToOne
    @JoinColumn(name = "ID_QUESTION", referencedColumnName = "ID")
    private QuestionTag questionTag;

    @ManyToOne
    @JoinColumn(name = "ID_INTERVIEW", referencedColumnName = "ID")
    private Interview interview;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionTag> questionTagList;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionComment> questionCommentList;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionSolution> questionSolutionList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QuestionTag getQuestionTag() {
        return questionTag;
    }

    public void setQuestionTag(QuestionTag questionTag) {
        this.questionTag = questionTag;
    }

    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
    }

    public List<QuestionTag> getQuestionTagList() {
        return questionTagList;
    }

    public void setQuestionTagList(List<QuestionTag> questionTagList) {
        this.questionTagList = questionTagList;
    }

    public List<QuestionComment> getQuestionCommentList() {
        return questionCommentList;
    }

    public void setQuestionCommentList(List<QuestionComment> questionCommentList) {
        this.questionCommentList = questionCommentList;
    }

    public List<QuestionSolution> getQuestionSolutionList() {
        return questionSolutionList;
    }

    public void setQuestionSolutionList(List<QuestionSolution> questionSolutionList) {
        this.questionSolutionList = questionSolutionList;
    }
}
