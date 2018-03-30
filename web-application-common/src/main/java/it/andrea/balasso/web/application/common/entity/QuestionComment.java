package it.andrea.balasso.web.application.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "QUESTION_COMMENT")
public class QuestionComment {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_QUESTION_COMMENT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "QUESTION_COMMENT")
    private String questionComment;

    @Column(name = "QUESTION_LIKE")
    private Boolean questionLike;

    @ManyToOne
    @JoinColumn(name = "ID_QUESTION", referencedColumnName = "ID")
    private Question question;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionComment() {
        return questionComment;
    }

    public void setQuestionComment(String questionComment) {
        this.questionComment = questionComment;
    }

    public Boolean getQuestionLike() {
        return questionLike;
    }

    public void setQuestionLike(Boolean questionLike) {
        this.questionLike = questionLike;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
